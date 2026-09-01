class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int j = 1;
        int n = nums.length-1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                swap(nums, i+1, j);
                i++;
                j++;
            }
        }
        return i+1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}