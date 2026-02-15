class Solution {
    public String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        for(int i = n - 1, j = m - 1; i >= 0 || j >= 0; i--, j--) {
            char x = (i >= 0) ? a.charAt(i) : '0';
            char y = (j >= 0) ? b.charAt(j) : '0';
            if(x=='1' && y=='1' && carry==0){
                ans.append('0');
                carry = 1;
            }
            else if(x=='1' && y=='1' && carry==1){
                ans.append('1');
                carry = 1;
            }
            else if((x=='1' && y=='0' && carry==1) || 
                    (x=='0' && y=='1' && carry==1)){
                ans.append('0');
                carry = 1;
            }
            else if(x=='0' && y=='0' && carry==1){
                ans.append('1');
                carry = 0;
            }
            else if(x=='0' && y=='0' && carry==0){
                ans.append('0');
                carry = 0;
            }
            else {
                ans.append('1');
                carry = 0;
            }
        }
        if(carry == 1){
            ans.append('1');
        }
        return ans.reverse().toString();
    }
}
