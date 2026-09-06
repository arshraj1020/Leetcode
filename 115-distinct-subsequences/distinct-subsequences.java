class Solution {
    private int count(int i, int j, String s, String t, int[][] dp){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int notTake = count(i+1 , j, s , t, dp);
        int take = 0;
        if(s.charAt(i) == t.charAt(j)) take = count(i+1 , j+1, s , t, dp);
        return dp[i][j] = take + notTake;
    }
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j] = -1;
            }
        }
        if(n<m) return 0;
        return count(0 , 0, s , t, dp);
    }
}