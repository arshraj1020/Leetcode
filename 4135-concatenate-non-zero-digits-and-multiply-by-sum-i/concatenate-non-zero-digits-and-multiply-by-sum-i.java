class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long num = 0;
        long ans = 0;
        while(n != 0){
            int x = n%10;
            n /= 10;
            sum += x;
            if(x != 0){
                num *= 10;
                num += x;
            }
        }
        long rev = 0;
        while(num != 0){
            rev *= 10;
            rev += num %10;
            num /= 10;
        }
        return rev * sum;
    }
}