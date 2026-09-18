class Solution {
    HashMap<TreeNode , Integer> map = new HashMap<>();
    public int lvl(TreeNode root){
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int height = 1 + Math.max(lvl(root.left) , lvl(root.right));
        map.put(root , height);
        return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int right = lvl(root.right);
        int left = lvl(root.left);
        int mydia = right + left;
        return Math.max(mydia , Math.max(diameterOfBinaryTree(root.right) , diameterOfBinaryTree(root.left)));
    }
}