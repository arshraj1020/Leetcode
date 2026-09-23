class Solution {
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        find(root);
        return ans;
    }
    public int find(TreeNode root){
        if(root == null) return 0;
        int left = find(root.left);
        int right = find(root.right);
        ans+= Math.abs(left) + Math.abs(right);
        return (left + right +root.val)-1;
    }
}