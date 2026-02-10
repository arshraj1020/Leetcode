class Solution {
    public int longestBalanced(int[] nums) {
        HashSet<Integer> odd = new HashSet<>();
        HashSet<Integer> even = new HashSet<>();
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            odd.clear(); even.clear();
            for(int j=i; j<nums.length; j++){
                int num = nums[j];
                if(num%2==0) even.add(num);
                else odd.add(num);
                if(even.size() == odd.size())  ans = Math.max(ans , j-i+1);
            }
        }
        return ans;
    }
}