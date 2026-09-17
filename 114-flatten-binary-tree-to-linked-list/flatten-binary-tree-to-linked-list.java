class Solution {
    public void fill(ArrayList<TreeNode> arr , TreeNode root){
        if(root == null) return;
        arr.add(root);
        fill(arr , root.left);
        fill(arr , root.right);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        fill(arr , root);
        for(int i=0; i<arr.size()-1; i++){
            arr.get(i).right = arr.get(i+1);
            arr.get(i).left = null;
        }
    }
}