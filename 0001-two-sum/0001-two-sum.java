class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - nums[i];
            if(map.containsKey(second)) {
                int arr[] = {i, map.get(second)};
                return arr;
            }
            map.put(first, i);
        }
        return null;
    }
}