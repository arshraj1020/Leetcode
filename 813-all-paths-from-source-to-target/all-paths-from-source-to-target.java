class Solution {
    public void Dfs(int node , int n , List<List<Integer>> ans , List<Integer> curr , int[][] graph){
        if(node == n-1) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int ele : graph[node]){
            curr.add(ele);
            Dfs(ele , graph.length, ans , curr , graph);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(0);
        Dfs(0 , graph.length, ans , curr , graph);
        return ans;
    }
}