class Solution {
    List<String> ans = new ArrayList<>();
    public void helper(String curr, int n, int open, int close){
        int m = curr.length();
        if(open == n && close == n){
            ans.add(curr);
            return;
        }
        if(m == 0) helper(curr + '(' , n, open+1, close);
        else if(open < n && open >= close) {
            helper(curr + ')' ,n, open, close+1);
            helper(curr + '(' ,n, open+1, close);
        }
        else if(open == n) helper(curr + ')' ,n, open, close+1);

    }
    public List<String> generateParenthesis(int n) {
        helper("", n , 0, 0);
        return ans;
    }
}