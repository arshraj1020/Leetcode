class Solution {
    public boolean similar(String curr, String[] dictionary){
        for(String s : dictionary){
            int max = 2;
            for(int i=0; i<s.length(); i++){
                if(curr.charAt(i) != s.charAt(i)){
                    max--;
                    if(max < 0) break;
                }
            }
            if(max >= 0) return true;
        }
        return false;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            if(similar(queries[i] , dictionary)) ans.add(queries[i]);
        }
        return ans;
    }
}