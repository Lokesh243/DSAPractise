class MaxPathSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxsum = Integer.MIN_VALUE;

    static int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        maxpath(root);
        return maxsum;
    }

    static int maxpath(TreeNode root) {
        if (root == null)
            return 0;

        int lh = Math.max(0, maxpath(root.left));
        int rh = Math.max(0, maxpath(root.right));

        maxsum = Math.max(maxsum, lh + rh + root.val);

        return root.val + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root));
    }
}
