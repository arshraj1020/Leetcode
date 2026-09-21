class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] res = new int[n];
        int[] freq = new int[1001];
        for (int num : arr1) freq[num]++;
        int k = 0;
        for (int num : arr2) {
            while (freq[num] > 0) {
                res[k++] = num;
                freq[num]--;
            }
        }
        for (int i = 0; i <= 1000; i++) {
            while (freq[i] > 0) {
                res[k++] = i;
                freq[i]--;
            }
        }
        return res;
    }
}