class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int idx = 0;
        int[] ans = new int[nums.length];
        for(int ele : nums){
            if(ele < pivot) ans[idx++] = ele;
            else if(ele == pivot) q2.add(ele);
            else q.add(ele);
        }
        while(q2.size() > 0) ans[idx++] = q2.remove();
        while(q.size() > 0) ans[idx++] = q.remove();
        return ans;
    }
}