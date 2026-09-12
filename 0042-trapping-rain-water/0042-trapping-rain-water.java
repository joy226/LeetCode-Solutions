class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;

        int maxl = height[l];
        int maxr = height[r];

        int toatal_water = 0;

        while (l < r) {
            int current = 0;
            if(maxl >= maxr) {
                r = r - 1;
                maxr = Math.max(maxr, height[r]);
                current = maxr - height[r];
                toatal_water += current;
            } else {
                l = l + 1;
                maxl = Math.max(maxl, height[l]);
                current = maxl - height[l];
                toatal_water += current;
            }
        }
        return toatal_water;
    }
}