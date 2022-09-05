package verticalOrderTraversalOfABinaryTree;

import utils.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    int left = 0;
    int right = 0;
    Map<Integer,List<int[]>> map = new HashMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(map.get(i).stream()
                    .sorted((a, b)-> {
                        if (a[1] == b[1]) return a[0] - b[0];
                        else return a[1] - b[1];
                    })
                    .map(a -> a[0])
                    .collect(Collectors.toList()));
        }
        return result;
    }

    void dfs(TreeNode node, int col, int row) {
        if (node == null) return;
        left = Math.min(left, col);
        right = Math.max(right, col);
        List<int[]> list = map.getOrDefault(col, new ArrayList<>());
        list.add(new int[]{node.val, row});
        map.put(col, list);
        dfs(node.left ,col - 1, row + 1);
        dfs(node.right, col + 1, row + 1);
    }
}
