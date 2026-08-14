class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(map.containsKey(ch)){
                    int freq = map.get(ch);
                    if(freq == 2){
                        break;
                    }else map.put(ch , freq+1);
                }else map.put(ch , 1);
                max = Math.max(max , j-i+1);
            }
        }
        return max;
    }
}