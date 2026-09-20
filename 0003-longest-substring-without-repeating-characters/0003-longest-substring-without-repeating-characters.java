class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0, start = 0, end = 0;
        int[] index = new int[128];
        Arrays.fill(index, -1);

        while(end < s.length()) {
            char c = s.charAt(end);
            if(index[c] != -1) {
                int position = index[c];
                if(position >= start) {
                    start = position+1;
                }
            }
            int tempLength = end - start + 1;
            if(tempLength > maxLength) {
                maxLength = tempLength;
            }
            index[c] = end;
            end++;
        }
        return maxLength;
    }
}