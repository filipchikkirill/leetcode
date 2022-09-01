package removeDuplicatesFromSortedList;

import utils.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node !=null && node.next !=null){
            if(node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().deleteDuplicates(
                new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2))))));
    }
}
