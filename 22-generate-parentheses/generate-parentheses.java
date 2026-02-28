class Solution {
    public void genrate(int n , String s, int nOpen , int nClose , List<String> ans){
        int m = s.length();
        if(nOpen == n && nClose == n){
            ans.add(s);
            return;
        }
        if(m == 0) genrate(n , s+'(' , nOpen+1 , nClose , ans);
        else if(nOpen<n && nOpen>=nClose){
            genrate(n , s+')' , nOpen , nClose+1 , ans);
            genrate(n , s+'(' , nOpen+1 , nClose , ans);
        }else if(nOpen == n){
            genrate(n , s+')' , nOpen , nClose+1 , ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        int nOpen = 0;
        int nClose = 0;
        List<String> ans = new ArrayList<>();
        genrate(n , "" , nOpen , nClose , ans);
        return ans;
    }
}