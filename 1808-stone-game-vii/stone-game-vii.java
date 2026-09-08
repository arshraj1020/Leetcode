class Solution {
    public int min(int[] stones , int l, int r, long sum, int[][] dp){
        if(l + 1 == r) return Math.max(stones[l], stones[r]);
        if(dp[l][r] != -1) return dp[l][r];
        int left = min(stones, l + 1, r, sum - stones[l], dp);
        int right = min(stones, l, r - 1, sum - stones[r], dp);
        return dp[l][r] = Math.max((int)(sum - stones[l] - left), (int)(sum - stones[r] - right));
    }
    public int stoneGameVII(int[] stones) {
        long sum = 0;
        for(int ele : stones) sum += ele;
        int[][] dp = new int[stones.length][stones.length];
        for(int i=0; i<stones.length; i++){
            for(int j=0; j<stones.length; j++){
                dp[i][j] = -1;
            }
        }
        return min(stones, 0, stones.length-1, sum, dp);
    }
}