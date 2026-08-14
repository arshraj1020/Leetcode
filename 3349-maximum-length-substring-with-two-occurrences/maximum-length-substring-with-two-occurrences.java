class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0, j=0, max=0;
        HashMap<Character , Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                if(freq == 2){
                    max = Math.max(max , j-i);
                    while(s.charAt(i) != ch){
                        int count = map.get(s.charAt(i));
                        map.put(s.charAt(i) , count - 1);
                        i++;
                    }
                    map.put(ch, map.get(ch) - 1);
                    i++;
                    map.put(ch, map.get(ch) + 1);
                }else map.put(ch, freq+1);
            }else map.put(ch , 1);
            j++;
        }
        max = Math.max(max , j-i);
        return max;
    }
}