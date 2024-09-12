class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long result = 1;
        while (result * result <= x) {
            result++;
        }
        return (int) (result - 1);
    }
}