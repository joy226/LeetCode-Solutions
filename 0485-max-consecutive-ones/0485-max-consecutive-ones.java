class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0; // Stores the maximum count found so far
        int currentConsecutiveOnes = 0; // Stores the count of consecutive ones in the current sequence

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentConsecutiveOnes++; // Increment count if we see a '1'
            } else {
                // If we see a '0', the current sequence of ones is broken.
                // Compare the current count with the maximum found so far.
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
                currentConsecutiveOnes = 0; // Reset count for the next sequence
            }
        }

        // After the loop, we need to check one last time.
        // This handles the case where the array ends with a sequence of '1's.
        if (currentConsecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = currentConsecutiveOnes;
        }

        return maxConsecutiveOnes;
    }
}