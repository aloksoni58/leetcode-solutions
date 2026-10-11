class Solution {
    public String longestPalindrome(String s) {
        
        int maxLength = 0, left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            int oddSize = expandAroundCentre(s, i, i);
            int evenSize = expandAroundCentre(s, i, i+1);
            int temp = oddSize > evenSize ? oddSize : evenSize;
            if(temp > maxLength) {
                maxLength = temp;
                if(oddSize > evenSize) {
                    left = i - oddSize / 2;
                    right = i + oddSize / 2 + 1;
                } else {
                    left = i - (evenSize / 2) + 1;
                    right = i + evenSize / 2 + 1;
                }
            }
        }
        return s.substring(left, right);
    }

    public int expandAroundCentre(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}