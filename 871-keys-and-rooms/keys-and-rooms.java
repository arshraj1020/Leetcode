class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size() != 0){
            int curr = q.remove();
            if(visited[curr]) continue;
            visited[curr] = true;
            for(int j=0; j<rooms.get(curr).size(); j++){
                q.add(rooms.get(curr).get(j));
            }
        }
        for(int i=0; i<n; i++){
            if(!visited[i]) return false;
        }
        return true;
    }
}