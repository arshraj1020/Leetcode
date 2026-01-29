class Solution {
    public class Pair{
        int to; int cost;
        Pair(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    public class Triplate implements Comparable<Triplate>{
        int to; int cost; int stops;
        Triplate(int to, int cost, int stops){
            this.to = to;
            this.cost = cost;
            this.stops = stops;
        }
        public int compareTo(Triplate t){
            return this.stops - t.stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int[] ans = new int[n];
        Arrays.fill(ans , Integer.MAX_VALUE);
        ans[src] = 0; 
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        for(int i=0; i<flights.length; i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];
            adj.get(from).add(new Pair(to , cost));
        }
        PriorityQueue<Triplate> pq = new PriorityQueue<>();
        pq.add(new Triplate(src,0,0));
        while(pq.size() > 0){
            Triplate top = pq.remove();
            int to = top.to; int cost = top.cost; int stops = top.stops;
            // if(stops == k+1 && to == dst) return ans[to];
            if(stops == k+1) continue;
            for(Pair p : adj.get(to)){
                int going = p.to;
                int price = p.cost;
                int total = cost + price;
                if(ans[going] > total){
                    ans[going] = total;
                    pq.add (new Triplate(going , total , stops+1));
                }
                
            }
        }
        if(ans[dst] == Integer.MAX_VALUE) return -1;
        else return ans[dst];
    }
}