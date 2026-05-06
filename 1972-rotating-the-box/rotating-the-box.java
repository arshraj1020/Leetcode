class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid[0].length;
        int n = boxGrid.length;
        for(int i=0; i<n; i++){
            int empty =m-1;
            for(int j=m-1; j>=0; j--){
                if(boxGrid[i][j] == '*') empty = j-1;
                else if(boxGrid[i][j] == '#') {
                    boxGrid[i][j] = '.';
                    boxGrid[i][empty] = '#';
                    empty--;
                }
            }
        }
        char[][] rotated = new char[m][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) rotated[j][n - 1 - i] = boxGrid[i][j];
        return rotated;
    }
}