class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int num = n;
        while(num != 1){
            int sum = 0;
            while(num != 0){
                int x = num%10;
                sum += x*x;
                num /= 10;
            }
            if(set.contains(sum)) return false;
            set.add(sum);
            num = sum;
        }
        return true;
    }
}