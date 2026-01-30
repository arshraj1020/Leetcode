class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] ans = new int[n+1];
        Arrays.fill(ans , Integer.MAX_VALUE);
        ans[k] = 0;
        for(int x=1; x<n; x++){
            for(int i=0; i<times.length; i++){
                int u = times[i][0] , v = times[i][1] , wt = times[i][2];
                if(ans[u] == Integer.MAX_VALUE) continue;
                if(ans[u] + wt < ans[v]) ans[v] = ans[u] + wt;
            }
        }
        int max = 0;
        for(int i=1; i<=n; i++){
            if(ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max , ans[i]);
        }
        return max;
    }
}