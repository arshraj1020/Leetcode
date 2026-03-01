class Solution {
    public ListNode rev(ListNode F , ListNode L){
        ListNode prev = null;
        while(F!=L){
            ListNode FN = F.next;
            F.next = prev;
            prev = F;
            F = FN;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode F = head;
        ListNode L = head;
        for(int i=0; i<k; i++){
            if(L == null) return head;
            L = L.next;
        }
        ListNode temp = rev(F , L);
        F.next = reverseKGroup(L , k);
        return temp;
    }
}