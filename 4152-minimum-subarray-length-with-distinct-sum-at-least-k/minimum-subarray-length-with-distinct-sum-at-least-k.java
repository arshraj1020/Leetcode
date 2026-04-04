class Solution {
    public int minLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int i = 0;
        int distinctSum = 0;
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            int val = nums[j];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            if (freq.get(val) == 1) {
                distinctSum += val;
            }
            while (distinctSum >= k) {
                ans = Math.min(ans, j - i + 1);
                int leftVal = nums[i];
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    distinctSum -= leftVal;
                }
                i++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}