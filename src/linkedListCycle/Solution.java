package linkedListCycle;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private final Set<ListNode> nodeSet = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        if (nodeSet.add(head)) {
            return hasCycle(head.next);
        }
        return true;
    }

    public boolean hasCycleSlowFast(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode lastNode = new ListNode(-4);
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0 , lastNode)));
        // if it has Cycle
        lastNode.next = head.next;

        System.out.println(new Solution().hasCycleSlowFast(head));
        System.out.println(new Solution().hasCycle(head));
    }
}
