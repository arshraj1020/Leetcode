class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head.next == null){
            if(head.val == nums[0]) return null;
        }
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
                if(curr == null) break;
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}