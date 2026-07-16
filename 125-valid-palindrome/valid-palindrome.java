class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll(" ", "");
        result = result.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(result);
        int i=0 , j = result.length()-1;
        while(i < j){
            if(result.charAt(i) != result.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}