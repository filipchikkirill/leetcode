package binaryTreeZigzagLevelOrderTraversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        boolean isReverse = true;
        while (!queue.isEmpty()) {
            ArrayList<Integer> lvl = new ArrayList<>();
            List<TreeNode> list = new ArrayList<>();
            for (TreeNode node : queue) {
                if (node != null) {
                    lvl.add(node.val);
                    if (node.left != null) list.add(node.left);
                    if (node.right != null) list.add(node.right);
                }
            }
            if (isReverse) Collections.reverse(lvl);
            isReverse = !isReverse;
            queue = list;
            result.add(lvl);
        }
        return result;
    }
}
