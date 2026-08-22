import java.util.*;

class Width {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().index;
            int first = 0;
            int last = 0;

            for (int i = 0; i < size; i++) {
                Pair current = q.poll();

                int index = current.index - min;

                if (i == 0)
                    first = index;

                if (i == size - 1)
                    last = index;

                if (current.node.left != null)
                    q.offer(new Pair(current.node.left, 2 * index + 1));

                if (current.node.right != null)
                    q.offer(new Pair(current.node.right, 2 * index + 2));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    static class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(widthOfBinaryTree(root));
    }
}
