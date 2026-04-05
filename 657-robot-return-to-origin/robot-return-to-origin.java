class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[4];
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'R') arr[0]++;
            else if(ch == 'L') arr[1]++;
            else if(ch == 'U') arr[2]++;
            else if(ch == 'D') arr[3]++;
        }
        return (arr[0] == arr[1] && arr[2] == arr[3]);
    }
}