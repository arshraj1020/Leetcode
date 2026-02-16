class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        int x = 0 , y = nums.length-1;
        for(int i=0; i<nums.length-2; i++){
            x = i+1;
            y = nums.length-1;
            while(x<y){
                int a= nums[i],b = nums[x], c = nums[y];
                int sum = (a+b+c);
                if(sum == target) return target;
                if(Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
                if(sum > target) y--;
                else x++;
            }
        }
        return ans;
    }
}