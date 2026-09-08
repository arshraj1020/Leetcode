class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<candyType.length; i++) set.add(candyType[i]);
        return Math.min(candyType.length/2 , set.size());
    }
}