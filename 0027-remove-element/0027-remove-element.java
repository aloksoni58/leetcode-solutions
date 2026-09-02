class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = nums.length-1;
        while(i <= j) {
           if(nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                i++;
                j--;
           } else if(nums[i] == val && nums[j] == val){
                j--;
           } else {
                i++;
           }
        }
        return i;
    }
}