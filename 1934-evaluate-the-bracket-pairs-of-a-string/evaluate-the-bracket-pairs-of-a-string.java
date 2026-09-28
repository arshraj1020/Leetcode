class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String , String> seen = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            seen.put(knowledge.get(i).get(0) , knowledge.get(i).get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                int x = i+1;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(x) != ')'){
                    sb.append(s.charAt(x++));
                }
                if(seen.containsKey(sb.toString())){
                    ans.append(seen.get(sb.toString()));
                }else ans.append('?');
                i = x;
            }else ans.append(ch);
        }
        return ans.toString();
    }
}