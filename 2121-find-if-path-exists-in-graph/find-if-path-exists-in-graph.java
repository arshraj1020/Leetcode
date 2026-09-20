class Solution {
    public boolean check(int n , ArrayList<ArrayList<Integer>> arr, boolean[] seen, int src, int dest){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> now = arr.get(src);
        for(int i=0; i<now.size(); i++) q.add(now.get(i));
        while(q.size() != 0){
            int curr = q.remove();
            seen[curr] = true;
            if(curr == dest) return true;
            ArrayList<Integer> temp = arr.get(curr);
            for(int i=0; i<temp.size(); i++) {
                if(seen[temp.get(i)] == true) continue;
                q.add(temp.get(i));
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n== 1 && edges.length == 0) return true;
        boolean[] seen = new boolean[n];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++) arr.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        return check(n, arr, seen, source, destination);
    }
}