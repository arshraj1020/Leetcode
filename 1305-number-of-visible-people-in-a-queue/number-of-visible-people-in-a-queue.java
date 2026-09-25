class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i = heights.length-1; i>=0; i--){
            int count =0;
            while(st.size()!=0 && st.peek() < heights[i]){
                st.pop();
                count++;
            }
            count = !st.isEmpty() ? count + 1 : count;
            ans[i] = count;
            st.push(heights[i]);
        }
        return ans;
    }
}