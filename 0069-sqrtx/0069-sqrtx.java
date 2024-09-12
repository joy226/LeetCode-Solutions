class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // Initialize left and right pointers
        long left = 1;
        long right = x;

        // Perform binary search
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid; // Exact square root found
            } else if (square > x) {
                right = mid - 1; // Square is too large
            } else {
                left = mid + 1; // Square is too small
            }
        }

        // If exact square root not found, return the largest integer whose square is less than or equal to x
        return (int) (left - 1);
    }
}