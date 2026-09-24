class Solution {
    public int DigitSum(int n){
        int sum = 0;
        while(n != 0){
            int x = n%10;
            n /= 10;
            sum += x;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = DigitSum(nums[i]);
            if(sum == i){
                ans = Math.min(ans , sum);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}