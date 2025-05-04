class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0; // Pointer for valid elements

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right]; // Move valid elements to the front
                left++; // Move the "left" pointer forward
            }
        }

        return left; // The "left" pointer will be the new length
    }
}
