class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()) {
            int val = (int) ch;
            if(set.contains((char)(val)) && set.contains((char)(val + 32))) continue;
            if(set.contains((char)(val)) && set.contains((char)(val - 32))) continue;
            if(val >= 65 && val <= 90) {
                if(set.contains((char)(val + 32))) ans++;
            }
            else {
                if(set.contains((char)(val - 32))) ans++;
            }
            set.add(ch);
        }
        return ans;
    }
}