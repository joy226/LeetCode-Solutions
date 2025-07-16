class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++) {
            // int x = nums[i];
            // int y = target - x;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return new int[] {};
    }
}