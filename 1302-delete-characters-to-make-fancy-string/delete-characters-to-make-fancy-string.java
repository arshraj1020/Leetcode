class Solution {
    public String makeFancyString(String s) {
        char prev = '1';
        boolean flag = false;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(flag == true && ch == prev) continue;
            else flag = false; 
            if(prev == ch) flag = true;
            ans.append(ch);
            prev = ch;
        }
        return ans.toString();
    }
}