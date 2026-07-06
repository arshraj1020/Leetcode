class Solution {

    public int money(int[] nums , int n, int[] dp){
        if(n >= nums.length) return 0;
        if(dp[n] != -1) return dp[n];
        int take = nums[n] + money(nums , n+2 , dp);
        int skip = money(nums , n+1 , dp);
        return dp[n] = Math.max(take , skip);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return money(nums , 0 , dp);
    }
}