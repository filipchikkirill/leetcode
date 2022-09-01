package mergeTwoSortedLists;

import utils.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val < pointer2.val) {
                pointer.next = pointer1;
                pointer1 = pointer1.next;
            } else {
                pointer.next = pointer2;
                pointer2 = pointer2.next;
            }
            pointer = pointer.next;
        }
        if (pointer1 != null) {
            pointer.next = pointer1;
        }
        if (pointer2 != null) {
            pointer.next = pointer2;
        }
        return head.next;
    }
}
