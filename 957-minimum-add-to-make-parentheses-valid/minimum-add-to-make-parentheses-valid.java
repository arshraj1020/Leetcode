class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') st.push(')');
            else if(ch == ')' && st.size() == 0) ans++;
            else if(ch == ')' && st.peek() == ')') st.pop();
        }
        return ans + st.size();
    }
}