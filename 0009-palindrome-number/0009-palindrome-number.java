class Solution {
    public boolean isPalindrome(int x) {
        int a = x; // store the value of x into a
        int b = 0; // make a new varable to store the reverse of x
        while(a > 0) {  // start the while loop (a>0)
            int rem = a % 10;  // to get the last digit of a
            b = b * 10 + rem;  // add that digit into b
            a = a / 10;  // remove the last value
        }

        // if value of x == b then the number is Palindrome number else no.
        if(x == b) {  
            return true;
        }
        return false;
    }
}