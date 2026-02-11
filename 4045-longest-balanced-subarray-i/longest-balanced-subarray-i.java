import java.util.*;

class Solution {
    public int longestBalanced(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            Map<Integer, Integer> freq = new HashMap<>();
            int distinctEven = 0;
            int distinctOdd = 0;

            for (int j = i; j < n; j++) {

                int num = nums[j];

                freq.put(num, freq.getOrDefault(num, 0) + 1);

                // If first time seeing this number in this subarray
                if (freq.get(num) == 1) {
                    if (num % 2 == 0) {
                        distinctEven++;
                    } else {
                        distinctOdd++;
                    }
                }

                if (distinctEven == distinctOdd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                // Small pruning:
                // If remaining elements can't beat maxLen, break
                if (n - i <= maxLen) break;
            }
        }

        return maxLen;
    }
}
