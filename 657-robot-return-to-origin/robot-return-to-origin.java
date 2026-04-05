class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[4];
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'R') arr[0]++;
            if(ch == 'L') arr[1]++;
            if(ch == 'U') arr[2]++;
            if(ch == 'D') arr[3]++;
        }
        if(arr[0] == arr[1] && arr[2] == arr[3]) return true;
        return false;
    }
}