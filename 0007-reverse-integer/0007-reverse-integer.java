class Solution {
    public int reverse(int x) {
        long n = 0; // initialize the reverse number to 0
        while(x != 0) {
            int rem = x % 10; // get the last digit of x
            n = n * 10 + rem; // append the digit to the reversed number.
            x = x / 10; // remove the last digit
        }
        if(n > Integer.MAX_VALUE || n<Integer.MIN_VALUE){
            return 0;
        }
        return (int) n;
    }
}