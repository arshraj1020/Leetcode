class Solution {
    private class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele , int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i] , freq+1);
            }else map.put(nums[i] , 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : map.keySet()) pq.add(new Pair(ele , map.get(ele)));
        for(int i=0; i<k; i++){
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}