class Solution {
    public void find(int[][] isConnected , int i, boolean[] seen){
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        seen[i] = true;
        q.add(i);
        while(q.size() > 0){
            int curr = q.remove();
            for(int j=0; j<n; j++){
                if(isConnected[curr][j] == 1 && seen[j] == false){
                    q.add(j);
                    seen[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans =0;
        boolean[] seen = new boolean[n];
        for(int i=0; i<n; i++){
            if(!seen[i]){
                find(isConnected , i, seen);
                ans++;
            }
        }
        return ans;
    }
}