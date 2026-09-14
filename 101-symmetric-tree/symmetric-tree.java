class Solution {
    public void mirror(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        mirror(root.right);
        mirror(root.left);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p == null && q == null) return true;
        if(p.val != q.val) return false;
        return isSameTree(p.right , q.right) && isSameTree(p.left , q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        mirror(root.right);
        return isSameTree(root.right , root.left);
    }
}