class DiameterOptimised {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static int diameter = 0;

    static int height(TreeNode root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh + rh);

        return 1 + Math.max(lh, rh);
    }

    static int diameter(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(6);

        System.out.println(diameter(root));
    }
}
