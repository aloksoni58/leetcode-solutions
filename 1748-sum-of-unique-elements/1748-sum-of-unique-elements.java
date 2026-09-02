class Solution {
    public int sumOfUnique(int[] nums) {
        int max = nums[0];
        for(int i : nums) {
            if(max < i) {
                max = i;
            }
        }

        int[] freq = new int[max+1];

        for(int i : nums) {
            freq[i]++;
        }

        int sum = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}