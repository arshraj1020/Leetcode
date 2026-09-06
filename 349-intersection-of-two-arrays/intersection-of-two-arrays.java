class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele : nums2){
            if(set.contains(ele)) set2.add(ele);
        }
        int[] ans = new int[set2.size()];
        int x = 0;
        for(int ele : set2){
            ans[x++] = ele;
        }
        return ans;
    }
}