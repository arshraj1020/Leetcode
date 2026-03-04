class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    boolean flag = false;
                    for(int x=0; x<mat.length; x++){
                        if(x == i) continue;
                        if(mat[x][j] == 1){
                            flag = true;
                            break;
                        }
                    }
                    for(int y=0; y<mat[0].length; y++){
                        if(y == j) continue;
                        if(mat[i][y] == 1){
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false) ans++;
                }
            }
        }
        return ans;
    }
}