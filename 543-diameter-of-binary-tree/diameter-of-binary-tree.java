class Solution {
    public int lvl(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(lvl(root.right) , lvl(root.left));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int mydia = lvl(root.right) + lvl(root.left);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(mydia , Math.max(left , right));
    }
}