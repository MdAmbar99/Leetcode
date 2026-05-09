class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        int size = words.length;

        String ans = "";

        for(int i = size-1; i>=0; i--){
            if(words[i].equals("")){
                continue;
            }
            ans = ans + words[i] + " ";
        }

        return ans.trim();
    }
}