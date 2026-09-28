class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i] , i);
        }
        for(int i=0; i<nums1.length; i++){
            int x = map.get(nums1[i]);
            x++;
            int curr = -1;
            while(x != nums2.length){
                if(nums2[x] > nums1[i]){
                    curr = nums2[x];
                    break;
                }
                x++;
            }
            ans[i] = curr;
        }
        return ans;
    }
}