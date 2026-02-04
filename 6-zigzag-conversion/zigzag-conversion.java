class Solution {
    public String convert(String s, int num) {
        int n = s.length();
        if (num == 1) return s;
        ArrayList<ArrayList<Character>> grid = new ArrayList<>();
        for(int i=0; i<num; i++) grid.add(new ArrayList<>());
        int j =0;
        boolean down = true;
        for(int i=0; i<n; i++){
            grid.get(j).add(s.charAt(i));
            if (j == 0) {
                down = true;
            } else if (j == num - 1) {
                down = false;
            }
            if(down) j++;
            else j--;
        }
        String ans = "";
        for(int i=0; i<grid.size(); i++){
            for(int k=0; k<grid.get(i).size(); k++){
                ans += grid.get(i).get(k);
            }
        }
        return ans;
    }
}