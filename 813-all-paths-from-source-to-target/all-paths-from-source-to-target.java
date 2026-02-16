class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(0);
        q.add(curr);
        while(q.size()>0){
            curr = q.remove();
            int v = curr.get(curr.size()-1);
            if(v == graph.length-1) {
                ans.add(curr);
                continue;
            }
            for(int ele : graph[v]){
                List<Integer> temp = new ArrayList<>(curr);
                temp.add(ele);
                q.add(temp);
            }
        }
        return ans;
    }
}