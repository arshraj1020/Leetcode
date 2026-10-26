class Solution {
    public long island(int[][] grid, boolean[][] vis, int i, int j, int n, int m){
        vis[i][j] = true;
        long currSum = grid[i][j];
        if(i+1 < n && vis[i+1][j] == false && grid[i+1][j] != 0){
            currSum += island(grid, vis, i+1, j, n, m);
        }
        if(j+1 < m && vis[i][j+1] == false && grid[i][j+1] != 0){
            currSum += island(grid, vis, i, j+1, n, m);
        }
        if(i-1 >= 0 && vis[i-1][j] == false && grid[i-1][j] != 0){
            currSum += island(grid, vis, i-1, j, n, m);
        }
        if(j-1 >= 0 && vis[i][j-1] == false && grid[i][j-1] != 0){
            currSum += island(grid, vis, i, j-1, n, m);
        }
        return currSum;
    }
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] != 0 && vis[i][j] == false){
                    long currSum = island(grid, vis, i, j, n, m);
                    if(currSum % k == 0) ans++;
                }
            }
        }
        return ans;
    }
}