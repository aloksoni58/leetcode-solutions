class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i)-'a';
            sArr[idx]++;
        }

        for(int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i)-'a';
            tArr[idx]++;
        }

        for(int i = 0; i < 26; i++) {
            if(sArr[i] != tArr[i])
                return false; 
        }

        return true;
    }
}