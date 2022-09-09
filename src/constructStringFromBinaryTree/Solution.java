package constructStringFromBinaryTree;

import utils.TreeNode;

public class Solution {
    StringBuilder result;
    public String tree2str(TreeNode root) {
        result = new StringBuilder();
        dfs(root);
        return result.toString();
    }

    void dfs(TreeNode node) {
        if (node == null) return;

        result.append(node.val);

        if (node.left != null) {
            result.append("(");
            dfs(node.left);
            result.append(")");
        }

        if (node.left == null && node.right != null) result.append("()");

        if (node.right != null) {
            result.append("(");
            dfs(node.right);
            result.append(")");
        }
    }
}
