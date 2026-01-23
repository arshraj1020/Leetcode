class Solution {
    public class Pair implements Comparable<Pair> {
        int node;
        int time;
        Pair(int node , int time){
            this.node = node;
            this.time = time;
        }
        public int compareTo(Pair other) {
            return Integer.compare(this.time, other.time);
        }   
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++) adj.add(new ArrayList<>());
        for(int i=0; i<times.length; i++){
            int u = times[i][0];
            int v = times[i][1];
            int t = times[i][2];
            adj.get(u).add(new Pair(v , t));
        }

        int[] ans = new int[n+1];
        Arrays.fill(ans , Integer.MAX_VALUE);
        ans[0] = -221;
        ans[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k , 0));

        while(pq.size()>0){
            Pair top = pq.remove();
            int node = top.node;
            int time = top.time;
            if(time > ans[node]) continue;
            for(Pair p : adj.get(node)){
                int TotalTime = p.time + time;
                if(TotalTime < ans[p.node]){
                    ans[p.node] = TotalTime;
                    pq.add(new Pair(p.node , TotalTime));
                }
            }
        }
        int max = -1;
        for(int ele : ans){
            max = Math.max(max , ele);
        }
        if(max == Integer.MAX_VALUE) return -1;
        return max;
    }
}