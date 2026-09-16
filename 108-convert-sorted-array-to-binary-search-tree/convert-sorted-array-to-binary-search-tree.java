class Solution {
    public TreeNode create(int[] nums , int hi, int lo){
        if(hi < lo) return null;
        int mid = lo + (hi-lo)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = create(nums , mid-1, lo);
        node.right = create(nums , hi, mid+1);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return create(nums , n-1, 0);
    }
}