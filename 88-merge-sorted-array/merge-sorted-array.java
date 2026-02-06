class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = new int[m+n];
        int i=0 , j=0, k=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]) copy[k++] = nums1[i++];
            else copy[k++] = nums2[j++];
        }
        while(i<m){
            copy[k++] = nums1[i++];
        }
        while(j<n){
            copy[k++] = nums2[j++];
        }
        for(int x=0; x<copy.length; x++)nums1[x] = copy[x]; 
    }
}