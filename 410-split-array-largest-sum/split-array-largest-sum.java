class Solution {
    private boolean isValid(int mid , int k , int[] nums){
        int pages = 0;
        int student = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > mid) return false;
            if(nums[i] + pages <= mid){
                pages+= nums[i];
            }else{
                student++;
                pages = nums[i];
            }
        }
        if(student > k) return false;
        else return true;
    }
    public int splitArray(int[] nums, int k) {
        int end =0;
        for(int ele : nums) {
            end += ele;
        }
        if(k == 1) return end;
        int start = 0;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(mid , k , nums)){
                ans = mid;
                end = mid -1;
            }else start = mid+1;
        }
        return ans;
    }
}