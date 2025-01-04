class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        // int start = 0;
        // int end = nums.length - 1;
        // while(start < end) {
        //     int mid = start + (end - start) / 2;
        //     if(nums[mid] > nums[min]) {

        //     }
        // }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}