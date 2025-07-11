class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // int[] rotated = new int[n];

        // for (int i = 0; i < n; i++) {
        //     rotated[(i + k) % n] = nums[i];
        // }

        // for (int i = 0; i < n; i++) {
        //     nums[i] = rotated[i];
        // }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0 , k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] arr, int s, int e) {
        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}