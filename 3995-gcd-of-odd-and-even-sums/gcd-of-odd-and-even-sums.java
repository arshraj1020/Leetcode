class Solution {
    public int Gcd(int a , int b){
        if(a==0 || b==0) return Math.max(a, b);
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    public int gcdOfOddEvenSums(int n) {
        int od = 0;
        int ev = 0;
        boolean odd = true;
        for(int i=1; i<=n*2; i++){
            if(odd) {
                od += i;
                odd = false;
            }else {
                ev += i;
                odd = true;
            }
        }
        return Gcd(od , ev);
    }
}