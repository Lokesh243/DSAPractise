import java.util.*;

public class PostOrder1Stack {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> ans = postorderTraversal(root);

        System.out.println(ans);
    }

    static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;
        TreeNode temp = null;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                temp = st.peek().right;

                if (temp == null) {
                    temp = st.pop();
                    ans.add(temp.val);

                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        ans.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        }

        return ans;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}