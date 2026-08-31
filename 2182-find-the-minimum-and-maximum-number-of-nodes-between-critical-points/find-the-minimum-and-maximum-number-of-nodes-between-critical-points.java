class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nex = head.next.next;
        int first = -1 ; int last = -1;
        int idx = 1;
        int mindis = Integer.MAX_VALUE;
        int [] arr = {-1, -1};
        while(nex != null){
            if(curr.val > prev.val && curr.val > nex.val || curr.val < prev.val && curr.val < nex.val){
                if(first == -1) first = idx;
                if(last != -1){
                    int dis = idx - last;
                    mindis = Math.min(mindis , dis);
                } 
                last = idx;
            }
            idx++;
            prev = prev.next;
            curr = curr.next;
            nex = nex.next;
        }
        if(first == last) return arr;
        int maxdis = last - first;
        arr[0] = mindis;
        arr[1] = maxdis;
        return arr;
    }
}