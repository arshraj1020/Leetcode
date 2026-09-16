class Solution {
    public int level(TreeNode root){
        if(root == null) return 0;
        int left = level(root.left);
        int right = level(root.right);
        if(right == 0 || left == 0) return 1+ right + left;
        return 1 + Math.min(right , left);
    }
    public int minDepth(TreeNode root) {
        return level(root);
    }
}