class Solution {
    private int GCD(int a , int b){
        if(a % b == 0) return b;
        return GCD(b , a%b);
    }
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ele : nums){
            max = Math.max(max , ele);
            min = Math.min(min , ele);
        }
        return GCD(max , min);
    }
}