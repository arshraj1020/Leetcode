class Solution {
    public int lvl(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(lvl(root.right) , lvl(root.left));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int right = lvl(root.right);
        int left = lvl(root.left);
        if(Math.abs(right - left) >=2) return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }
}