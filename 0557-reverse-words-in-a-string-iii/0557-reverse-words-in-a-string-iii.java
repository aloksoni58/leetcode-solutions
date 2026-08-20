class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = 0;
        int k = 0;
        String res = "";
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || i == s.length()-1) {
                k = i==s.length()-1 ? i : i-1;
                while(k >= j) {
                    res += s.charAt(k);
                    k--;
                }
                if(i != s.length()-1) {
                    res += ' ';
                }
                j = i+1;
            }
            i++;
        }
        return res;
    }
}