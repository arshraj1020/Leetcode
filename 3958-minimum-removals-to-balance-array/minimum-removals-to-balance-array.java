class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0 , j=0;
        int MaxLen =0;
        while(j<n){
            int max = 0 , min = 0;
            if((long)nums[i]*k >= nums[j]){
                int len = j - i + 1;
                MaxLen = Math.max(len , MaxLen);
                j++;
            }else i++;
        }
        return n - MaxLen;
    }
}