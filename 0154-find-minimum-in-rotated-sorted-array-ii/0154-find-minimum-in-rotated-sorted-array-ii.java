class Solution {
    // public int findMin(int[] nums) {
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 0; i < nums.length; i++) {
    //         if(nums[i] < min) {
    //             min = nums[i];
    //         }
    //     }
    //     return min;
    // }

        public int findMin(int[] nums) {
        
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] > nums[hi]) { 
                lo = mi + 1;
            }
            else if (nums[mi] < nums[lo]) { 
                hi = mi;
                lo++;
            }
            else { // nums[lo] <= nums[mi] <= nums[hi] 
                hi--;
            }
        }
        
        return nums[lo];
    }
}