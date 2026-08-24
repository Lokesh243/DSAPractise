class LevelOrder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        if (root == null)
            return list;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list1 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode current = queue.poll();

                list1.add(current.val);

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }

            list.add(list1);
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
    }
}
