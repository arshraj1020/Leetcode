class Solution {
    public int min(int[] cost , int n, int[] dp){
        if(n == 1 || n== 0) return cost[n];
        if(dp[n] != -1) return dp[n];
        return dp[n] = cost[n] + Math.min(min(cost , n-1, dp) , min(cost , n-2 , dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(min(cost , n-1, dp) , min(cost , n-2, dp));
    }
}