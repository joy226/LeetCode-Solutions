class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length - 1; i+=2) {
            result[i] = nums[i + 1];
            result[i + 1] = nums[i];
        }
    return result;
    }
}
