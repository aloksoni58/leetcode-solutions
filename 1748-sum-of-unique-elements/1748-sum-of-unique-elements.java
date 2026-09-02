class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                    nums[j] = nums[n-1];
                    n--;
                    j--;
                }
            }
            if(count == 1) {
                sum += nums[i];
            }
        }

        return sum;
    }
}