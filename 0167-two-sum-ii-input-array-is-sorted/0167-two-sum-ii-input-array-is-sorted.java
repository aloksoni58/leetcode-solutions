class Solution {
    public int[] twoSum(int[] a, int target) {
        
        int s = 0;
        int e = a.length-1;
        while(s < e) {
            if(a[s]+a[e] == target) {
                return new int[]{s+1, e+1};
            } else if(a[s]+a[e] > target) {
                e--;
            } else if(a[s]+a[e] < target) {
                s++;
            }
        }
        return new int[]{-1,-1};
    }
}