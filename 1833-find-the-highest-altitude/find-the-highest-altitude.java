class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int alt = 0;
        for(int i=0; i<gain.length; i++){
            alt += gain[i];
            ans = Math.max(alt , ans);
        }
        return ans;
    }
}