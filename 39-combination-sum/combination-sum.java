class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, list, res);
        return res;
    }

    public void backtrack(int[] candidates, int target, int currSum, int start, List<Integer> list, List<List<Integer>> res) {
        if (currSum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (currSum + candidates[i] > target) break;
            list.add(candidates[i]);
            backtrack(candidates, target, currSum + candidates[i], i,list,res);
            list.remove(list.size() - 1);
        }
    }
}