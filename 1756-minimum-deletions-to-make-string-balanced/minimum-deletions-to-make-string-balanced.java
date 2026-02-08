class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int deletions = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'b') {
                bCount++;
            } else {
                deletions = Math.min(deletions + 1, bCount);
            }
        }
        return deletions;
    }
}
