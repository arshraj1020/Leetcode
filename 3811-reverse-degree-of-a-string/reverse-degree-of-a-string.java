class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int product = 1;
       for(int i=0; i<s.length(); i++){
        int index = s.charAt(i)-'a';
        int reverse = 26-index;
        product = (i+1)*reverse;
        sum = sum + product;
       }
       return sum;
    }
}