class Solution {
    public boolean checkOnesSegment(String s) {
        Boolean flag = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1' && flag == true) continue;
            else if(ch == '0'){
                flag = false;
                continue;
            }else return false;
        }
        return true;
    }
}