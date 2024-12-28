class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        return helper(nums, 0, 0, 1, ans);
    }

    public int[] helper(int[] nums, int i, int count, int j, int[] ans) {
        if(i == nums.length) {
            return ans;
        }
        if(nums[i] > nums[j] && nums[i] != nums[j]) {
            count++;
        }
        if(j == nums.length - 1) {
            ans[i] = count;
            return helper(nums, i + 1, 0, 0, ans);
        }
        return helper(nums, i , count, j + 1, ans);

    }
}