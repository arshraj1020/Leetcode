class Solution {
    class Pair{
        int lvl;
        TreeNode node;
        Pair(TreeNode node , int lvl){
            this.lvl = lvl;
            this.node = node;
        }
    }
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.right) , level(root.left));
    }
    public void helper(TreeNode root , List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root != null) q.add(new Pair(root , 0));
        while(q.size() != 0){
            Pair curr = q.remove();
            TreeNode node = curr.node;
            int lvl = curr.lvl;
            ans.get(lvl).add(node.val);
            if(node.left != null) q.add(new Pair(node.left , lvl+1));
            if(node.right != null) q.add(new Pair(node.right , lvl+1));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for(int i=0; i<lvl; i++) ans.add(new ArrayList<>());
        helper(root, ans);
        return ans;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = levelOrder(root);
        Collections.reverse(ans);
        return ans;
    }
}