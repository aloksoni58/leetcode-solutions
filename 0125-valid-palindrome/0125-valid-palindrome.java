class Solution {
    public String getPlaneString(String s) {
        String res = "";
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                res += c;
            }
            i++;
        }
        return res;
    }
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        if(s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        // s = getPlaneString(s);
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            // if(s.charAt(start) != s.charAt(end)) {
            //     return false;
            // }
            char l = s.charAt(start);
            char r = s.charAt(end);
            if(!Character.isLetterOrDigit(l)) {
                start++;
            } else if(!Character.isLetterOrDigit(r)) {
                end--;
            } else {
                if(l != r) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;

    }
}