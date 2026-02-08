class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int right = height(root.right);
        int left = height(root.left);
        if(Math.abs(right - left) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}