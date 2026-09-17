class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                ans++;
                set.clear();
            }
            set.add(ch);
        }
        return ans+1;
    }
}