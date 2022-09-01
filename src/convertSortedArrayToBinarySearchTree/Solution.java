package convertSortedArrayToBinarySearchTree;

import utils.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int low, int hi) {
        if (low > hi) {
            return null;
        }
        int mid = low + (hi - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums, low, mid -1);
        node.right = dfs(nums, mid + 1, hi);
        return node;
    }
}
