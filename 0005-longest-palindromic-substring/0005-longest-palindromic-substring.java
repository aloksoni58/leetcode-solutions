class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() == 1) {
            return s;
        }
        int maxLength = 0, left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            int oddSize = expandAroundCentre(s, i, i);
            int evenSize = expandAroundCentre(s, i, i+1);
            int temp = oddSize > evenSize ? oddSize : evenSize;
            if(temp > maxLength) {
                maxLength = temp;
                left = i - (temp-1) / 2;
                right = i + temp / 2 ;
            }
        }
        return s.substring(left, right + 1);

    }

    public int expandAroundCentre(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end-start-1;
    }
}