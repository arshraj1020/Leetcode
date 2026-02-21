class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int SR = 0;
        int SC = 0;
        int ER = n-1;
        int EC = n-1;
        int count = 1;
        while(SR<=EC && SC<=EC){
            //right
            for(int j=SC; j<=EC; j++){
                ans[SR][j] = count++;
            }
            //down
            for(int i=SR+1; i<=ER; i++){
                ans[i][EC] = count++;
            }
            //left
            for(int j=EC-1; j>=SC; j--){
                ans[ER][j] = count++;
            }
            //up
            for(int i=ER-1; i>=SR+1; i--){
                ans[i][SC] = count++;
            }
            SR++; ER--; SC++; EC--;
        }
        return ans;
    }
}