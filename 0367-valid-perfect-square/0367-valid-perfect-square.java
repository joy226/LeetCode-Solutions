class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end) {
            long mid = start + (end - start) / 2; // Use long to avoid potential overflow
            long square = mid * mid;
            if(square > num) {
                end = (int)mid - 1;
            } else if (square < num) {
                start = (int)mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}