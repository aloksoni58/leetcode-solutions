class Solution {
    public int firstUniqChar(String s) {
        
       
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        char ch = '\u0000';
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() == 1) {
                ch = m.getKey();
                break;
            }
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch)
                return i;
        }

        return -1;
    }
}