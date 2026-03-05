class Solution {
    public int count(String s , int op){
        Boolean flag = true;
        if(s.charAt(0) == '0'){
            flag = false;
        }
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(flag == false && ch == '1'){
                flag = true;
            }else if(flag == false && ch == '0'){
                op++;
                flag = true;
            }else if(flag == true && ch == '1'){
                op++;
                flag = false;
            }else{
                flag = false;
            }
        }
        return op;
    }
    public int minOperations(String org) {
        String s = new String(org);
        int first = count(s , 0);

        if(s.charAt(0) == '0'){
            s = '1' + s.substring(1);
        }else{
            s = '0' + s.substring(1);
        }

        int second = count(s , 1);
        return Math.min(first , second);
    }
}