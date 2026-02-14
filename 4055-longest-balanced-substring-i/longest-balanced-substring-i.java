class Solution {
    public boolean check(int[] arr){
        int now = 0;
        for(int i=0; i<26; i++){
            if(arr[i] == 0) continue;
            if(now == 0) now = arr[i];
            else if(now != arr[i]) return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int MaxLen = 0; 
        int n = s.length();
        for(int i=0; i<n; i++){
            int[] arr = new int[26];
            for(int j=i; j<n; j++){
                char ch = s.charAt(j);
                arr[ch - 'a']++;
                if(check(arr)) MaxLen = Integer.max(MaxLen , j-i+1);
            }
        }
        return MaxLen;
    }
}