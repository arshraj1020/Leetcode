class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        while(set.contains(head.val)) head = head.next;
        ListNode curr = head.next ;
        ListNode prev = head;
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
                curr = prev.next;
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}