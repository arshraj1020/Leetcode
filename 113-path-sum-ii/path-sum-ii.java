class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    private void fill(List<Integer> curr , TreeNode root, int targetSum, int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            sum += root.val;
            if(sum == targetSum) {
                curr.add(root.val);
                ans.add(new ArrayList<>(curr));
                curr.remove(curr.size()-1);
            }
            sum -= root.val;
            return;
        }
        curr.add(root.val);
        fill(curr , root.right, targetSum, sum+root.val);
        fill(curr , root.left, targetSum, sum+root.val);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> curr = new ArrayList<>();
        fill(curr , root , targetSum, 0);
        return ans;
    }
}