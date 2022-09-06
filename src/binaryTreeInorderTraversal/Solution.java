package binaryTreeInorderTraversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        result.add(node.val);
        dfs(node.right);

    }
}
