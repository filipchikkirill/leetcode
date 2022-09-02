package countGoodNodesInBinaryTree;

import utils.TreeNode;

public class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += dfs(root.left, root.val) + dfs(root.right, root.val);
        return count;
    }

    private int dfs(TreeNode root, int currentMax) {

        int amount = 0;
        if (root == null) {
            return 0;
        }
        if (root.val >= currentMax) {
            amount++;
            currentMax = root.val;
        }

        amount += dfs(root.left, currentMax);
        amount += dfs(root.right, currentMax);
        return amount;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)));

        Solution test = new Solution();
        long start = System.nanoTime();
        int res = test.goodNodes(head);
        long avg = System.nanoTime() - start;
        for (int i = 0; i < 1; i++) {
            start = System.nanoTime();
            test.goodNodes(head);
            avg += System.nanoTime() - start;
            avg /= 2;
        }
        System.out.println(avg);
        System.out.println(res);
    }
}
