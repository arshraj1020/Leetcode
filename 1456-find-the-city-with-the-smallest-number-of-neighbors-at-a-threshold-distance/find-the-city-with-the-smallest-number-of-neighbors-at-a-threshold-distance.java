class Solution {
    public int findTheCity(int n, int[][] edges, int threshold) {
        int[][] dis = new int[n][n];
        for(int i=0; i<dis.length; i++){
            for(int j=0; j<dis.length; j++){
                if(i == j) continue;
                dis[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0] , v = edges[i][1], c = edges[i][2];
            dis[u][v] = c;
            dis[v][u] = c;
        }
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                if(i==k) continue;
                for(int j=0; j<n; j++){
                    if(j==k) continue;
                    if(dis[i][k] != Integer.MAX_VALUE && dis[k][j] != Integer.MAX_VALUE){
                        dis[i][j] = Math.min(dis[i][j] , dis[k][j]+dis[i][k]);
                    }
                }
            }
        }
        int minCity = -1;
        int MinCount = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(i == j) continue;
                if(dis[i][j] <= threshold) count++;
            }
            if(count <= MinCount){
                MinCount = count;
                minCity = i;
            }
        }
        return minCity;
    }
}