package addTwoNumbers;

import utils.ListNode;

class Solution {
    Integer curVal = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && curVal == 0) return null;

        if (l1 != null) {
            curVal += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            curVal += l2.val;
            l2 = l2.next;
        }
        int val = curVal % 10;
        curVal = curVal / 10;

        return new ListNode(val, addTwoNumbers(l1, l2));
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        while (listNode.next != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
