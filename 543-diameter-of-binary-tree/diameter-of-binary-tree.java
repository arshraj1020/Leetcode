class Solution {
    public int lvl(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max( lvl(root.left) , lvl(root.right) );
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int right = lvl(root.right);
        int left = lvl(root.left);
        int mydia = right + left;
        return Math.max(mydia , Math.max(diameterOfBinaryTree(root.right) , diameterOfBinaryTree(root.left)));
    }
}