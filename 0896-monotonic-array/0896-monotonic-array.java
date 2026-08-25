class Solution {

    public boolean isIncreasing(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i])
                return false;
        }
        return true;
    }

    public boolean isDecreasing(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i])
                return false;
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {
       return isIncreasing(nums) || isDecreasing(nums);
    }
}