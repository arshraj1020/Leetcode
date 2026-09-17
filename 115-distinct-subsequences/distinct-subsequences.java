class Solution {
    Integer[][] dp;
    public int count(String s, String t, int i, int j){
        if(j >= t.length()) return 1;
        if(i >= s.length()) return 0;
        if(dp[i][j] != null) return dp[i][j];
        int take = 0;
        if(s.charAt(i) == t.charAt(j)) take = count(s , t , i+1 , j+1);
        int skip = count(s , t, i+1 , j);
        return dp[i][j] = take + skip;
    }
    public int numDistinct(String s, String t) {
        dp= new Integer[s.length()][t.length()];
        return count(s , t , 0 , 0);
    }
}