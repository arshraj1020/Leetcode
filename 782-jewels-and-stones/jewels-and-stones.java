class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<jewels.length(); i++) set.add(jewels.charAt(i));
        int ans = 0;
        for(int i=0; i<stones.length(); i++){
            char ch = stones.charAt(i);
            if(set.contains(ch)) ans++;
        }
        return ans;
    }
}