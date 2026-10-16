class Solution {
    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }

    public void heapSort(int[] arr) {
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for(int i = n-1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public void heapify(int[] arr, int i, int n) {
        int minPosition = i;
        int leftPosition = 2 * i + 1;
        int rightPosition = 2 * i + 2;
        if(leftPosition < n && arr[leftPosition] > arr[minPosition])
            minPosition = leftPosition;
        if(rightPosition < n && arr[rightPosition] > arr[minPosition])
            minPosition = rightPosition;
        if(minPosition != i) {
            swap(arr, i, minPosition);
            heapify(arr, minPosition, n);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}