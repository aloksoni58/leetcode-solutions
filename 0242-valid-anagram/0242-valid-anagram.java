class Solution {
    public char[] toCharArray(String s) {
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        return c;
    }

    public void sortArray(char[] c) {
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c.length-1-i; j++) {
                if(c[j] > c[j+1]) {
                    char ch = c[j];
                    c[j] = c[j+1];
                    c[j+1] = ch;
                }
            }
        }
    }

    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        // char[] c1 = toCharArray(s);
        // char[] c2 = toCharArray(t);
        // sortArray(c1);
        // sortArray(c2);
        // for(int i = 0; i < c1.length; i++) {
        //     if(c1[i] != c2[i]) {
        //         return false;
        //     }
        // }
        // return true;

        // HashMap<Character, Integer> m1 = new HashMap<>();
        // HashMap<Character, Integer> m2 = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0)+1);
        //     m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0)+1);
        // }

        // for(int i = 0; i < s.length(); i++) {
        //     if(!m1.get(s.charAt(i)).equals(m2.get(s.charAt(i)))) {
        //         return false;
        //     }
        // }
        
        // return true;

        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(int i = 0 ; i < s.length(); i++) {
            int sIdx = s.charAt(i)-'a';
            sArr[sIdx] = sArr[sIdx]+1;
        }

        for(int i = 0 ; i < t.length(); i++) {
            int tIdx = t.charAt(i)-'a';
            tArr[tIdx] = tArr[tIdx]+1;
        }

        for(int i = 0; i < 26; i++) {
            if(sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;

    }
}