class Solution {
    public boolean hasSameDigits(String s) {
        String x = s;
        if (x.length() <= 1) return true;
        while (x.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < x.length() - 1; i++) {
                int n = x.charAt(i) - '0';
                int m = x.charAt(i + 1) - '0';
                sb.append((n + m) % 10);
            }
            x = sb.toString();
        }
        return x.charAt(0) == x.charAt(1);
    }
}