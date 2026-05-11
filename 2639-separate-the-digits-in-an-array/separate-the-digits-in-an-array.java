class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums){
            ArrayList<Integer> curr = new ArrayList<>();
            while(ele != 0){
                curr.add(ele%10);
                ele /=10;
            }
            ans.addAll(curr.reversed());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}