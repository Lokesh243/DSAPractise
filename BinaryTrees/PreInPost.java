import java.util.*;

public class PreInPost {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    static void traversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair p = st.pop();

            if (p.state == 1) {
                pre.add(p.node.val);
                p.state = 2;
                st.push(p);

                if (p.node.left != null)
                    st.push(new Pair(p.node.left, 1));

            } else if (p.state == 2) {
                in.add(p.node.val);
                p.state = 3;
                st.push(p);

                if (p.node.right != null)
                    st.push(new Pair(p.node.right, 1));

            } else {
                post.add(p.node.val);
            }
        }

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        traversal(root);
    }
}