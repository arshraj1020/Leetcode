class Solution {
    List<String> ans = new ArrayList<>();
    public void helper(String curr, int n, int open, int close, String[] dp){
        int m = curr.length();
        if(open == n && close == n){
            ans.add(curr);
            return;
        }
        if(open > n || close > open) return;
        if(m == 0) helper(curr + '(' , n, open+1, close, dp);
        else if(open < n && open >= close) {
            helper(curr + ')' ,n, open, close+1, dp);
            helper(curr + '(' ,n, open+1, close, dp);
        }
        else if(open == n) helper(curr + ')' ,n, open, close+1, dp);
    }
    public List<String> generateParenthesis(int n) {
        String[] dp = new String[n];
        helper("", n , 0, 0, dp);
        return ans;
    }
}