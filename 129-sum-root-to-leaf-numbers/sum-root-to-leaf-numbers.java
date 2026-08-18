class Solution {
    int sum = 0;
    public void DFS(TreeNode node , int num){
        if(node.left == null && node.right == null){
            sum += ((num*10) + node.val);
            return;
        }
        if(node.left != null) DFS (node.left , ((num * 10) + node.val));
        if(node.right != null) DFS (node.right , ((num * 10) + node.val));
    }
    public int sumNumbers(TreeNode root) {
        int num = 0;
        DFS(root, num);
        return sum;
    }
}