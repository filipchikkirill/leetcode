package n_aryTreeLevelOrderTraversal;

import utils.Node;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<Node> queue = List.of(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> lvl = new ArrayList<>();
            // without Stream Api it can be faster, but who cares
            queue = queue.stream()
                    .peek(node -> lvl.add(node.val))
                    .filter(node -> node.children != null)
                    .flatMap(node -> node.children.stream())
                    .filter(Objects::nonNull)
                    .toList();
            result.add(lvl);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Node> secLvlNodes = new ArrayList<>();
        secLvlNodes.add(new Node(3, List.of(new Node(5, List.of()))));
        secLvlNodes.add(new Node(2, List.of(new Node(5, List.of(new Node(6))))));
        secLvlNodes.add(new Node(4, List.of(new Node(5))));
        secLvlNodes.add(null);
        secLvlNodes.add(null);
        List<List<Integer>> lists = new Solution().levelOrder(new Node(1, secLvlNodes));
        System.out.println(lists);
    }
}

