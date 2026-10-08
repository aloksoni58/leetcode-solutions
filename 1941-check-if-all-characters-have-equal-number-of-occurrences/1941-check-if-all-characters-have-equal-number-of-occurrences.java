class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        if(s.length() == 0)
            return true;

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch-97]++; 
        }
        int temp = freq[s.charAt(0)-97];
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0 && freq[i] != temp)
                return false;
        }
        return true;
    }
}