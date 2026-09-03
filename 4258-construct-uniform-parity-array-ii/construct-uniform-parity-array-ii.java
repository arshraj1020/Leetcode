class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int ele: nums1) {
            min = Math.min(ele , min);
        }
        if(min % 2 == 1) return true;
        for(int ele: nums1) {
            if(ele %2 == 1) return false;
        }
        return true;
    }
}