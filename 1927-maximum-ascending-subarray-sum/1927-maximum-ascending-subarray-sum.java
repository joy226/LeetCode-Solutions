class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];
            } else {
                currSum = nums[i]; // start new ascending subarray
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
