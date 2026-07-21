class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            
            if(ch == '-' || ch == '+' || ch == '*'){
                String a = expression.substring(0, i);
                String b = expression.substring(i+1);

                List<Integer> al = diffWaysToCompute(a);
                List<Integer> bl = diffWaysToCompute(b);

                for(int x : al){
                    for(int y : bl){
                        if(ch == '-'){
                            ans.add(x-y);
                        }else if(ch == '+'){
                            ans.add(x+y);
                        }else if(ch == '*'){
                            ans.add(x*y);
                        }
                    }
                }

            }
        }
        if(ans.size() == 0) ans.add(Integer.valueOf(expression));
        return ans;
    }
}