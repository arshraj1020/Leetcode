class Solution {
    public void helper(int i, int[] nums , List<List<Integer>> ans, List<Integer> curr){
        if(i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        helper(i+1 ,nums, ans, curr);
        curr.add(nums[i]);
        helper(i+1 ,nums, ans, curr);
        curr.remove(curr.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0 , nums , ans, new ArrayList<>());
        return ans;
    }
}