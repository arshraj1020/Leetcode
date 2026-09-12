class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int ans = 1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                if(freq+1 > (nums.length/2)) ans = ele;
                map.put(ele , freq+1);
            }else map.put(ele , 1);
        }
        return ans;
    }
}