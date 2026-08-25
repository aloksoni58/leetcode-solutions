class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int complement = target - first;
            int index = map.getOrDefault(complement, -1);
            if(index >= 0) {
                return new int[]{i, index};
            } else {
                map.put(first, i);
            }
        }

        return new int[]{-1,-1};
    }
}