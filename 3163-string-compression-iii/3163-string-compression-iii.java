class Solution {
    public String compressedString(String word) {

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < word.length()) {
            char ch = word.charAt(i);
            int count = 0;
            while(i < word.length() && word.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    }
}