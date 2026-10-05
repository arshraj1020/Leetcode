class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u'); set.add('A'); set.add('O'); set.add('U'); set.add('E'); set.add('I');
        int left = 0;
        int right = s.length()-1;
        boolean gotLeft = false;
        boolean gotRight = false;
        char[] arr = s.toCharArray();
        while(left <= right){
            char chLeft = arr[left];
            char chRight = arr[right];
            if(set.contains(chLeft)) gotLeft = true;
            if(set.contains(chRight)) gotRight = true;
            if(gotLeft == gotRight && gotLeft == true){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                gotLeft = false;
                gotRight = false;
            }else if(gotLeft == true) right--;
            else if(gotRight == true) left++;
            else {
                right--;
                left++;
            }
        }
        return new String(arr);
    }
}