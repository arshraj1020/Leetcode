class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] out = new int[n];
        ArrayList<ArrayList<Integer>> connect = new ArrayList<>();
        for(int i=0; i<n; i++) connect.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            out[i] += graph[i].length;
            for(int j=0; j<graph[i].length; j++){
                connect.get(graph[i][j]).add(i);
            }
        }
        return kan(n, graph, out, connect);
    }
    public List<Integer> kan(int n, int[][] graph, int[] out, ArrayList<ArrayList<Integer>> connect){
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++)if(out[i] == 0) q.add(i);
        while(q.size() > 0){
            int front = q.remove();
            ans.add(front);
            for(int ele : connect.get(front)){
                out[ele]--;
                if(out[ele] == 0) q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}