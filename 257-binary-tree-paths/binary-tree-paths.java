class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        inorder(ans , root , "");
        return ans;
    }
    public void inorder(List<String> ans , TreeNode root, String curr){
        if(root == null) return;
        if(root.right == null && root.left == null) {
            ans.add(curr + root.val);
            return;
        }
        inorder(ans , root.right , curr + root.val + "->");
        inorder(ans , root.left, curr + root.val + "->");
    }
}