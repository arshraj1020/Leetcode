class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int shortest = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            int ones = 0;
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(ch == '1') ones++;
                if (ones == k) {
                    String binaryStr = s.substring(i, j + 1);
                    if (binaryStr.length() < shortest) {
                        shortest = binaryStr.length();
                        ans = binaryStr;
                    }
                    else if (binaryStr.length() == shortest && binaryStr.compareTo(ans) < 0) {
                        ans = binaryStr;
                    }
                }
            }
        }
        return ans;
    }
}