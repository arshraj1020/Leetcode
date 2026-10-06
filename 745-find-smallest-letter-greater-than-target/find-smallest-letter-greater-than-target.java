class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int trg = (int)target;
        int ans = Integer.MAX_VALUE;
        char out = '~';
        char small = '~';
        for(int i=0; i<letters.length; i++){
            char ch = letters[i];
            if((int)small > (int)ch){
                small = ch;
            }
            if((int)ch > trg){
                if((int)ch < ans){
                    ans = (int)ch;
                    out = ch;
                }
            }
        }
        if(out == '~'){
            return small;
        }
        return out;
    }
}