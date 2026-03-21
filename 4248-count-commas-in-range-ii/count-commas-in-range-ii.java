class Solution {
    public long countCommas(long n) {
        long ans = 0;
        if(n>=1000L) ans += n-999L;
        if(n>=1000000L) ans += n-999999L;
        if(n>=1000000000L)ans += n-999999999L;
        if(n>=1000000000000L)ans += n-999999999999L;
        if(n>=1000000000000000L)ans += n-999999999999999L;
        return ans;
    }
}