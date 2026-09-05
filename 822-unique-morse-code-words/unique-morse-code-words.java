class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder curr = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                int idx = ch-'a';
                curr.append(morse[idx]);
            }
            set.add(curr.toString());
        }
        return set.size();
    }
}