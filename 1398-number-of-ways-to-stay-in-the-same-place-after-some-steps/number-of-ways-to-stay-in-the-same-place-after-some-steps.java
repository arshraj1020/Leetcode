class Solution {
    public int ways(int steps, int arrLen, int i, int step, int[][] dp){
        if(step == steps){
            if(i == 0) return 1;
            else return 0;
        }
        if (dp[step][i] != -1) return dp[step][i];
        long ans = 0;
        if (i + 1 < arrLen) ans += ways(steps, arrLen, i + 1, step + 1, dp);
        ans += ways(steps, arrLen, i, step + 1, dp);
        if (i - 1 >= 0) ans += ways(steps, arrLen, i - 1, step + 1, dp);
        return dp[step][i] = (int)(ans % 1000000007);
    }
    public int numWays(int steps, int arrLen) {
        int maxPos = Math.min(arrLen, steps / 2 + 1);
        int[][] dp = new int[steps + 1][maxPos];
        for (int i = 0; i <= steps; i++) Arrays.fill(dp[i], -1);
        return ways(steps , maxPos, 0, 0, dp);
    }
}