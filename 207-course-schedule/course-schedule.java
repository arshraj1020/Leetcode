class Solution {
    boolean ans;
    public boolean canFinish(int n, int[][] pre) {
        ans = true;
        ArrayList<ArrayList<Integer>> connect = new ArrayList<>();
        for (int i = 0; i<n; i++) connect.add(new ArrayList<>());
        for (int i = 0; i<pre.length; i++) connect.get(pre[i][1]).add(pre[i][0]);
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        for(int i=0; i<n; i++){
            dfs(i, connect, vis , path);
        }
        return ans;
    }
    public void dfs(int i, ArrayList<ArrayList<Integer>> connect, boolean[] vis, boolean[] path){
        vis[i] = true; path[i] = true;
        for(int ele : connect.get(i)){
            if(path[ele] == true){
                ans = false;
                return;
            }
            if(vis[ele] == false) dfs(ele, connect, vis, path);
        }
        path[i] = false;
    }
}
