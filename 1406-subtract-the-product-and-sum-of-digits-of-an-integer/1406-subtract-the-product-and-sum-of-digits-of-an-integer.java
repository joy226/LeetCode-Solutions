class Solution {
    public static int subtractProductAndSum(int n) {
        return helper(n, 0, 1);
    }

    public static int helper (int n, int sum, int product) {
        if(n == 0) {
            return product - sum;
        }
        int rem = n % 10;
        return helper(n / 10, sum + rem, product * rem);
    }
}