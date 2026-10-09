class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        List<Map.Entry<Character, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).toList();
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> m : sorted) {
            int n = m.getValue();
            for(int i = 0; i < n; i++) {
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}