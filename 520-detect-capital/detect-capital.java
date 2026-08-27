class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        int small = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                small++;
            }else cap++;
        }
        if(cap == 0 || small == 0) return true;
        else if(cap == 1 && cap+small == word.length()) {
            if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') return true;
        }
        return false;
    }
}