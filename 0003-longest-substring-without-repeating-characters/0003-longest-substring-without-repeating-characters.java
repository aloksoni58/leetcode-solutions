class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int[] index = new int[128];
        Arrays.fill(index, -1);
        int start = 0, end = 0, maxLen = 0;
        while(end < s.length()) {
            char ch = s.charAt(end);
            if(index[ch] != -1) {
                int position = index[ch];
                if(position >= start) {
                    start = position + 1;
                }
            }
            int tempLen = end - start + 1;
            if(tempLen > maxLen) {
                maxLen = tempLen;
            }
            index[ch] = end;
            end++;
        }
        return maxLen;
    }
}