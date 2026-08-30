class Solution {
    public int profit (int sum , int[] prices, int i, boolean canBuy, int[][] dp){
        if(i >= prices.length) {
            return 0;
        }
        if(dp[i][canBuy ? 1 : 0] != -1) return dp[i][canBuy ? 1 : 0];
        int prof;
        if(canBuy){
            int buy = - prices[i] + profit(sum, prices, i+1, false, dp);
            int skip = profit(sum, prices, i+1, true, dp);
            prof = Math.max(buy , skip);
        }else {
            int sell = prices[i] + profit(sum, prices, i+1, true, dp);
            int skip = profit(sum, prices, i+1, false, dp);
            prof = Math.max(sell , skip);
        }
        return dp[i][canBuy ? 1 : 0] = prof;
    }
    public int maxProfit(int[] prices) {
        int sum = 0;
        int[][] dp = new int[prices.length][2];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        return profit(sum, prices, 0, true ,dp);
    }
}