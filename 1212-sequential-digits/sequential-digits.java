class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1; i<=9; i++){
            int n = i;
            for(int j=i+1; j<=9; j++){
                n *= 10;
                n += j;
                if( n>= low && n<= high) ans.add(n);
                if(n > high) break;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}