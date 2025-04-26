class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }

        long upper = (long) Math.pow(10, n) - 1;
        long lower = upper / 10;

        for (long i = upper; i > lower; i--) {
            long palindrome = createPalindrome(i);
            for (long j = upper; j * j >= palindrome; j--) {
                if (palindrome % j == 0) {
                    long factor2 = palindrome / j;
                    if (factor2 >= lower && factor2 <= upper) {
                        return (int) (palindrome % 1337);
                    }
                }
            }
        }

        return 0; // Should not reach here based on problem constraints
    }

    private long createPalindrome(long num) {
        String s = String.valueOf(num);
        String reversedS = new StringBuilder(s).reverse().toString();
        return Long.parseLong(s + reversedS);
    }
}