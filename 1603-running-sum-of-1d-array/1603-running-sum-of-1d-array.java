class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        return helper(nums, 0, 0, ans);
    }
    public static int[] helper(int[] arr, int sum, int i, int[] ans) {
        if(i == arr.length) {
            return ans;
        }
        sum = sum + arr[i];
        ans[i] = sum;
        return helper(arr, sum, i + 1, ans);
    }
}