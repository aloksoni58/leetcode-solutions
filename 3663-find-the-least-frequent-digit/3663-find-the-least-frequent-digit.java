class Solution {
    public int getLeastFrequentDigit(int n) {
        
        Map<Integer, Integer> m = new HashMap<>();

        while(n != 0) {
            int val = m.getOrDefault(n%10, 0);
            m.put(n%10, val+1);
            n/=10;
        }


        int min = Integer.MAX_VALUE;
        int least = 0;
        for(Map.Entry<Integer, Integer> e : m.entrySet()) {
            if(e.getValue() < min) {
                min = e.getValue(); 
                least = e.getKey();
            }
        }
        return least;
    }
}