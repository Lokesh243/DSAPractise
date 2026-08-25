import java.util.*;

class BoundaryTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    static void addLeftBoundary(TreeNode root, List<Integer> ans) {
        TreeNode current = root.left;

        while (current != null) {
            if (!isLeaf(current))
                ans.add(current.val);

            if (current.left != null)
                current = current.left;
            else
                current = current.right;
        }
    }

    static void addLeaves(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        if (isLeaf(root)) {
            ans.add(root.val);
            return;
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }

    static void addRightBoundary(TreeNode root, List<Integer> ans) {
        TreeNode current = root.right;
        List<Integer> temp = new ArrayList<>();

        while (current != null) {
            if (!isLeaf(current))
                temp.add(current.val);

            if (current.right != null)
                current = current.right;
            else
                current = current.left;
        }

        for (int i = temp.size() - 1; i >= 0; i--)
            ans.add(temp.get(i));
    }

    static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        if (!isLeaf(root))
            ans.add(root.val);

        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        System.out.println(boundaryTraversal(root));
    }
}
