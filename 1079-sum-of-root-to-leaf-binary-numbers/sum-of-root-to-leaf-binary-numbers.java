class Solution {
    public void paths(TreeNode root , String s , ArrayList<String> path){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            path.add(s);
            return;
        }
        paths(root.left , s+root.val, path);
        paths(root.right , s+root.val, path);
    }
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> path = new ArrayList<>();
        int ans = 0;
        paths(root , "", path);
        for(int i=0; i<path.size(); i++){
            String binary = path.get(i);
            int num = Integer.parseInt(binary, 2);
            ans += num;
        }
        return ans;
    }
}