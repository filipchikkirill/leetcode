package balancedBinaryTree;

import utils.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else {
            return (Math.abs(dfs(root.left) - dfs(root.right)) < 2)
                    && isBalanced(root.left)
                    && isBalanced(root.right);
        }
    }
    public int dfs(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}