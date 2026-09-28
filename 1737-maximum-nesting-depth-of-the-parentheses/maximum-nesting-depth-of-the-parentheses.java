class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push('(');
                ans = Math.max(ans , st.size());
            }else if(ch == ')'){
                if(st.size() != 0 && st.peek() == '('){
                    st.pop();
                }
            }
        }
        return ans;
    }
}