class Solution {
    public boolean check(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            sum += root.val;
            if(sum == targetSum) return true;
            sum -= root.val;
            return false;
        }
        return check(root.right , targetSum , sum + root.val) || check(root.left , targetSum , sum + root.val);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root , targetSum, 0);
    }
}