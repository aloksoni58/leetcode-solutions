class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length-1);
        return nums;
    }

    public void divide(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            mergeSort(arr, start, mid, end);
        }
    }

    public void mergeSort(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) 
                merge[k++] = arr[i++];
            else {
                merge[k++] = arr[j++];
            }
        }

        while(i <= mid)
            merge[k++] = arr[i++];
    
        while(j <= end)
            merge[k++] = arr[j++];

        for(int a = start, b = 0; b < merge.length; b++) {
            arr[a++] = merge[b]; 
        }
    }
}