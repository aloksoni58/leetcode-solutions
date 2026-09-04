class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> m = new TreeMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int val = m.getOrDefault(nums[i], 0);
                m.put(nums[i], val + 1);
            }
        }

        if(m.isEmpty()) {
            return -1;
        }
        int minCount = Integer.MIN_VALUE;
        int mostFreq = 0;

        for(Map.Entry<Integer,Integer> e : m.entrySet()) {
            if(e.getValue() > minCount) {
                minCount = e.getValue();
                mostFreq = e.getKey();
            }
        }
        return mostFreq;
    }
}