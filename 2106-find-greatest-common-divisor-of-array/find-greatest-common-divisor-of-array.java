class Solution {
    public int GCD(int a , int b){
        if(a%b==0) return b;
        return GCD(b , a%b);
    }
    public int findGCD(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            a = Math.max(a , nums[i]);
            b = Math.min(b , nums[i]);
        }
        return GCD(a,b);
    }
}