class Solution {
    public boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while(s <= e) {
            char start = str.charAt(s);
            char end = str.charAt(e);

            if(start >= 65 && start <= 90) {
                start += (char) 32;
            }

            if(end >= 65 && end <= 90) {
                end += (char) 32;
            }

            if( (start < 97 || start > 122 )&& (start < 48 || start > 57)) {
                s++;
                continue;
            }

            if( ( end < 97 || end > 122 ) && (end < 48 || end > 57)) {
               e--;
               continue;
            }

            if(start != end) {
                return false;
            }

            s++;
            e--;
        }
        return true;
    }
}