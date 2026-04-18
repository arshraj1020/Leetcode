class Solution {
    public int rev(int n){
        int re = 0;
        while(n != 0){
            re *= 10;
            re += n%10;
            n /= 10;
        }
        return re;
    }
    public int mirrorDistance(int n) {
        int nr = rev(n);
        return Math.abs(n - nr);
    }
}