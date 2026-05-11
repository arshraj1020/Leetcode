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
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}