class Solution {
    List<String> ans = new ArrayList<>();
    public void genrate(int n , String s, int nOpen , int nClose){
        int m = s.length();
        if(n*2 == m){
            ans.add(s);
            return;
        }
        if(nOpen < n)genrate(n , s+"(" , nOpen+1 , nClose);
        if(nOpen > nClose) genrate(n , s+")" , nOpen , nClose+1);
    }
    public List<String> generateParenthesis(int n) {
        genrate(n , "" , 0 , 0);
        return ans;
    }
}