class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int lh = findLeftHeight(root);
        System.out.print(lh + ",");
        int rh = findRightHeight(root);
        System.out.println(rh);
        if(lh == rh) return ((int)Math.pow(2,lh) - 1);
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    static int findLeftHeight(TreeNode root){
        if(root == null) return 0;
        int left = findLeftHeight(root.left);
        return 1 + left;
    }
    static int findRightHeight(TreeNode root){
        if(root == null) return 0;
        int right = findRightHeight(root.right);
        return 1 + right;
    }
}