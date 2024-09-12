class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        // linear search:
        // long result = 1;
        // while (result * result <= x) {
        //     result++;
        // }
        // return (int) (result - 1);
        // ################################


        // Binary Search:
        long start = 1;
        long end = x;
        while(start <= end){
            long mid = start + (end - start) / 2;

            if(mid * mid > x){
                end = mid - 1;
            }
            else if(mid * mid < x){
                start = mid + 1;
            }
            else{
                return (int) mid;
            }
        }
        return (int) (start - 1);
    }
}