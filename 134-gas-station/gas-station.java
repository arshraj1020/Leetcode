class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int curr = 0;
        int stock = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            int diff = gas[i] - cost[i];
            stock += diff;
            curr += diff;
            if(curr < 0){
                ans = i+1;
                curr = 0;
            }
        }
        if(stock < 0) return -1;
        return ans;
    }
}