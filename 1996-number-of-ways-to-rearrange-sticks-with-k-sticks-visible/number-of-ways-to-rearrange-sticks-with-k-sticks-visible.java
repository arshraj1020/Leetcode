class Solution {
    int mod = 1000000000+7;
    public int sub(int n , int k, int[][] dp){
        if(n < k || (k == 0 && n != 0)) return 0;
        if(n == 0 && k== 0) return 1;
        if(dp[n][k] != -1) return dp[n][k];
        long ans = ((long)sub(n-1 , k-1, dp) + (long)(n-1) * sub(n-1 , k , dp)) % mod; 
        return  dp[n][k] = (int)ans;
    }
    public int rearrangeSticks(int n, int k) {
        int[][] dp = new int[n+1][k+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=k; j++){
                dp[i][j] = -1;
            }
        }
        return sub(n , k, dp);
    }
}