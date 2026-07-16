class Solution {
    public int GCD(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i] , max);
            res[i] = GCD(nums[i] , max);
        }
        Arrays.sort(res);
        int i=0 , j = res.length-1;
        long ans = 0;
        while(i < j){
            ans += GCD(res[i] , res[j]);
            i++; j--;
        }
        return ans;
    }
}