class Solution {
    public class Pair implements Comparable<Pair> {
        int node;
        double prob;
        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair other) {
            return Double.compare(other.prob, this.prob);
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int dst) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double chance = succProb[i];
            adj.get(u).add(new Pair(v, chance));
            adj.get(v).add(new Pair(u, chance));
        }
        double[] ans = new double[n];
        ans[src] = 1.0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 1.0));
        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int node = top.node;
            double curProb = top.prob;
            if (curProb < ans[node]) continue;
            for (Pair p : adj.get(node)) {
                double totalProb = curProb * p.prob;
                if (totalProb > ans[p.node]) {
                    ans[p.node] = totalProb;
                    pq.add(new Pair(p.node, totalProb));
                }
            }
        }
        return ans[dst];
    }
}
