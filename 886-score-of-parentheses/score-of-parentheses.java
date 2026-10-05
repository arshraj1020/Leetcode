class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int deep = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                st.push(deep);
                deep = 0;
            }else deep = st.pop() + Math.max(2*deep, 1);
        }
        return deep;
    }
}