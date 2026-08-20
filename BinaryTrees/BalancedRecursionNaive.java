public class BalancedRecursionNaive {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        if (Math.abs(lh - rh) > 1) {
            return false;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if (!left || !right) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(8);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(9);
        root.left.left.left = new TreeNode(10);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(isBalanced(root));
    }
}
