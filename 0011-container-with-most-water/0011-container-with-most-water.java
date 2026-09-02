class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int maxWater = 0;
        while(s < e) {
            int area;
            if(height[s] < height[e]) {
                area = (e-s)*height[s];
                s++;
            } else {
                area = (e-s)*height[e];
                e--;
            }
            maxWater = Math.max(area, maxWater);
        }
        return maxWater;
    }
}