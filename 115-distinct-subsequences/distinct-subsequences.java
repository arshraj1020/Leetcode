class Solution {
    public int count(String s, String t, int[][] dp, int i, int j){
        if(j >= t.length()) return 1;
        if(i >= s.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int take = 0;
        if(s.charAt(i) == t.charAt(j)) take = count(s , t , dp , i+1 , j+1);
        int skip = count(s , t , dp , i+1 , j);
        return dp[i][j] = take + skip;
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                dp[i][j] = -1;
            }
        }
        return count(s , t , dp , 0 , 0);
    }
}