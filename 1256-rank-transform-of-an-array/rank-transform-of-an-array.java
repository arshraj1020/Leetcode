class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sr[i] = arr[i];
        }
        Arrays.sort(sr);
        HashMap<Integer , Integer> map = new HashMap<>();
        int curr = 0;
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(sr[i])){
                int idx = map.get(sr[i]);
                map.put(sr[i] , idx);
            }else {
                map.put(sr[i] , ++curr);
            }
        }
        for(int i=0; i<arr.length; i++){
            sr[i] = map.get(arr[i]);
        }
        return sr;
    }
}