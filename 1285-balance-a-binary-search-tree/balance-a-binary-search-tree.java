class Solution {
    public void In(ArrayList<TreeNode> arr , TreeNode root){
        if(root== null) return;
        In(arr , root.left);
        arr.add(root);
        In(arr , root.right);
    }
    public TreeNode Attach(ArrayList<TreeNode> arr , int inHi, int inLo){
        if(inLo>inHi) return null;
        int mid = (inHi + inLo)/2;
        TreeNode temp = arr.get(mid);
        temp.left = Attach(arr , mid-1, inLo);
        temp.right = Attach(arr , inHi, mid+1);
        return arr.get(mid);
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        In(arr , root);
        int inHi = arr.size()-1;
        int inLo = 0;
        return Attach(arr , inHi, inLo);
    }
}