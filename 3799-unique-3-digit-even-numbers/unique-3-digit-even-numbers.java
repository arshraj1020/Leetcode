class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] seen = new boolean[digits.length];
        HashSet<Integer> set = new HashSet<>();
        count(set , seen , digits, 0, 0);
        return set.size();
    }
    public void count(HashSet<Integer> set , boolean[] seen, int[] digits, int i, int num){
        if(i == 3){
            if(num % 2 == 0) set.add(num);
            return;
        }
        for(int j=0; j<digits.length; j++){
            if(seen[j]) continue;
            if(i== 0 && digits[j] == 0) continue;
            seen[j] = true;
            count(set , seen , digits, i+1, (num*10) + digits[j]);
            seen[j] = false;
        }
    }
}