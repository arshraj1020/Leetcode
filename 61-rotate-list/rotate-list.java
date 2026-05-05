class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode h = head;
        if(head == null || head.next == null){
            return head;
        }
        while(h != null){
            h = h.next;
            n++;
        }
        k %= n;
        if(k == 0 ) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i =0; i<k; i++){
            if(fast.next == null){
                return head;
            }
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        h = slow.next;
        slow.next = null;
        fast.next = head;
        return h;
    }
}