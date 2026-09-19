class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return money(nums , 0 , 0, dp);
    }
    public int money(int[] nums , int i, int first, int[][] dp){
        if(i>=nums.length)return 0;
        if(dp[i][first] != -1) return dp[i][first];
        int ans = 0;
        if(i==0){
            ans = nums[0] + money(nums , i+2 , 1, dp);
        }else if(i == nums.length-1 && first == 1){

        }else ans = nums[i] + money(nums , i+2 , first, dp);

        ans = Math.max(ans , money(nums , i+1 , first, dp));
        return dp[i][first] = ans;
    }
}