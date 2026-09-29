class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0; i< nums.length*2; i++) {
            int ind = i % nums.length;
            while(!st.isEmpty() && nums[st.peek()] < nums[ind]) {
                res[st.pop()] = nums[ind];
            }
            if(i < nums.length) {
                st.push(i);
            }
        }
        return res;
    }
}