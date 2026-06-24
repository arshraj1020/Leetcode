class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                if(map.containsKey(ch)){
                    int freq = map.get(ch);
                    map.put(ch , freq+1);
                }else map.put(ch , 1);
            }
        }

        if(map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n')){
            int freq = map.get('l');
            if(freq %2 == 0){
                freq /= 2;
            }else {
                freq--;
                freq /= 2;
            }
            map.put('l' , freq);

            freq = map.get('o');
            if(freq %2 == 0){
                freq /= 2;
            }else {
                freq--;
                freq /= 2;
            }
            map.put('o' , freq);

        }else return 0;

        int min = Integer.MAX_VALUE;
        for(int val : map.values()){
            min = Math.min(min , val);
        }
        return min;
    }
}