class Solution {
    public class Triplate implements Comparable<Triplate>{
        int row;
        int col;
        int effort;
        Triplate(int row , int col, int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        @Override
        public int compareTo(Triplate t){
            return this.effort - t.effort;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        ans[0][0] = 0;
        PriorityQueue<Triplate> pq = new PriorityQueue<>();
        pq.add(new Triplate(0,0,0));
        while(pq.size()>0){
            Triplate top = pq.remove();
            int row = top.row; int col = top.col; int effort = top.effort;
            if(row == n-1 && col == m-1) break;
            if(row>0){
                int diff = Math.abs(heights[row][col] - heights[row-1][col]);
                int e = Math.max(diff , effort);
                if(e < ans[row-1][col]){
                    ans[row-1][col] = e;
                    pq.add(new Triplate(row-1, col, e));
                }
            }
            if(col>0){
                int diff = Math.abs(heights[row][col] - heights[row][col-1]);
                int e = Math.max(diff , effort);
                if(e < ans[row][col-1]){
                    ans[row][col-1] = e;
                    pq.add(new Triplate(row, col-1, e));
                }
            }
            if(row<n-1){
                int diff = Math.abs(heights[row][col] - heights[row+1][col]);
                int e = Math.max(diff , effort);
                if(e < ans[row+1][col]){
                    ans[row+1][col] = e;
                    pq.add(new Triplate(row+1, col, e));
                }
            }
            if(col<m-1){
                int diff = Math.abs(heights[row][col] - heights[row][col+1]);
                int e = Math.max(diff , effort);
                if(e < ans[row][col+1]){
                    ans[row][col+1] = e;
                    pq.add(new Triplate(row, col+1, e));
                }
            }
        }
        return ans[n-1][m-1];
    }
}