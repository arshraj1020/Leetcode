class Solution {
    public class Triplate implements Comparable<Triplate>{
        int node; int parent; int dis;
        Triplate(int node , int parent, int dis){
            this.node = node;
            this.parent = parent;
            this.dis = dis;
        }
        public int compareTo(Triplate t){
            return this.dis - t.dis;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] vis = new boolean[n];
        int ans = 0;
        PriorityQueue<Triplate> pq = new PriorityQueue<>();
        pq.add(new Triplate(0,-1,0));
        while(pq.size()>0){
            Triplate top = pq.remove();
            int node = top.node , parent = top.parent, dis = top.dis;
            if(vis[node] == true) continue;
            ans += dis;
            vis[node] = true;
            for(int i=0; i<n; i++){
                if(i == node || i == parent) continue;
                if(vis[i] == true) continue;
                int x1 = points[i][0] , y1 = points[i][1];
                int x2 = points[node][0] , y2 = points[node][1];
                int mDis = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                pq.add(new Triplate(i , node , mDis));
            }
        }
        return ans;
    }
}