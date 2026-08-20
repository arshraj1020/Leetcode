class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i= 2; i<n; i++){
            int s1 = arr1.size();
            int s2 = arr2.size();
            if(arr1.get(s1-1) > arr2.get(s2-1)){
                arr1.add(nums[i]);
            }else {
                arr2.add(nums[i]);
            }
        }
        int j=0;
        while(j < arr1.size()){
            ans[j] = arr1.get(j++);
        }
        int x=0;
        while(x < arr2.size()){
            ans[j++] = arr2.get(x++);
        }
        return ans;
    }
}