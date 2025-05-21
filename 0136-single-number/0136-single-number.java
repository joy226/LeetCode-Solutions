class Solution {
    public int singleNumber(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         return nums[i];  // Return immediately when found
        //     }
        // }
        // return -1; // Or throw an exception if no single number is found

        int res = 0;
        for (int num : nums) {
            res ^= num;  // XOR cancels out numbers that appear twice
        }
        return res;
    }
}
