class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Arrays.sort(intervals , (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i<intervals.length; i++){
            int curr = i;
            int max = intervals[i][1];
            while(i < intervals.length-1 && max >= intervals[i + 1][0]){
                if(i < intervals.length) i++;
                max = Math.max(max , intervals[i][1]);
            }
            arr.add(new ArrayList<>(List.of(intervals[curr][0], max)));
        }
        int[][] ans = new int[arr.size()][2];
        for(int i=0; i<arr.size(); i++){
            ans[i][0] = arr.get(i).get(0);
            ans[i][1] = arr.get(i).get(1);
        }
        return ans;
    }
}