class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int idx = 0;
        int[] ans = new int[nums.length];
        for(int ele : nums){
            if(ele < pivot) ans[idx++] = ele;
            else if(ele == pivot) count++;
            else q.add(ele);
        }
        for(int i=0; i<count; i++) ans[idx++] = pivot;
        while(q.size() > 0) ans[idx++] = q.remove();
        return ans;
    }
}