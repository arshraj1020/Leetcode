class Solution {
    public int reverseDegree(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int x = 26;
        for(int i=97; i<=122; i++){
            map.put((char)(i) , x--);
        }
        int ans = 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            x = map.get(ch);
            ans += ((i+1)*x);
        }
        return ans-1;
    }
}