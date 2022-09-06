package removeNthNodeFromEndOfList;

import utils.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0xCAFEBABE, head);
        dfs(result, n);
        return result.next;
    }

    private int dfs(ListNode node, int n) {
        if (node == null) return 1;
        int level = dfs(node.next, n);
        if (n + 1 == level) {
            node.next = node.next.next;
        }
        return level + 1;
    }
}
