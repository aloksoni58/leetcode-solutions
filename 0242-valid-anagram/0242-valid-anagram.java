class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        System.out.println(sLen + ", " + tLen);
        if(sLen != tLen)
            return false;
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        for(int i = 0; i < sLen; i++) 
            sArr[s.charAt(i)-'a']++;
        for(int i = 0; i < tLen; i++) 
            tArr[t.charAt(i)-'a']++;
        for(int i = 0; i < 26; i++) 
            if(sArr[i] != tArr[i])
                return false;
        return true;
    }
}