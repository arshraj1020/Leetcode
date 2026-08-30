class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
                minIdx = i;
            }
            if(nums[i]>max){
                max = nums[i];
                maxIdx = i;
            }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        int fromLeft = right + 1;
        int fromRight = nums.length - left;
        int fromBoth = (left + 1) + (nums.length - right);
        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
    }
}