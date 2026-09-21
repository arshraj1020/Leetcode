class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i] , map.get(arr1[i])+1); 
            }else map.put(arr1[i] , 1);
        }
        int x = 0;
        for(int i=0; i<arr2.length; i++){
            int ele = arr2[i];
            int freq = map.get(arr2[i]);
            for(int j=1; j<=freq; j++){
                arr1[x++] = ele;
            }
            map.remove(ele);
        }
        ArrayList<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);
        for (int ele : remaining) {
            int freq = map.get(ele);
            for (int j = 1; j <= freq; j++) {
                arr1[x++] = ele;
            }
        }
        return arr1;
    }
}