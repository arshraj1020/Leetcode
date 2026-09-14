class Solution {
    class Pair{
        int lvl;
        TreeNode node;
        Pair(TreeNode node , int lvl){
            this.node = node;
            this.lvl = lvl;
        }
    }
    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.right) , levels(root.left));
    }
    public void fill(TreeNode node , List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(node != null) q.add(new Pair(node , 0));
        while(q.size() != 0){
            Pair curr = q.remove();
            TreeNode temp = curr.node;
            int lvl = curr.lvl;
            ans.get(lvl).add(temp.val);
            if(temp.left != null) q.add(new Pair(temp.left , lvl + 1));
            if(temp.right != null) q.add(new Pair(temp.right , lvl + 1));
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = levels(root);
        for(int i=0; i<level; i++) ans.add(new ArrayList<>());
        fill(root , ans);
        if(level == 1) return ans;
        for(int i=1; i<level; i+= 2){
            Collections.reverse(ans.get(i));
        }
        return ans;
    }
}