class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        while(curr != null){
            ListNode NextNode = curr.next;
            ListNode prev = dummy;
            while(prev.next != null && prev.next.val < curr.val) prev = prev.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = NextNode;
        }
        return dummy.next;
    }
}