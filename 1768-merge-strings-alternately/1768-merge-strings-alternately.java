class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int x1 = 0, x2 = 0;
        while(x1 < word1.length() && x2 < word2.length()) {
            res += word1.charAt(x1++);
            res += word2.charAt(x2++);
        }
        while(x1 < word1.length()) {
            res += word1.charAt(x1++);
        }
        while(x2 < word2.length()) {
            res += word2.charAt(x2++);
        }
        return res;
    }
}