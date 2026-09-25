class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left; i <= right; i++){
            boolean flag = true;
            int num = i;
            while(num != 0){
                int x = num % 10;
                if (x == 0 || i % x != 0) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if(flag) ans.add(i);
        }
        return ans;
    }
}