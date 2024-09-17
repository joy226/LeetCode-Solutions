class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(letters[mid] > target){
                e = mid - 1;
            } else {  //if is didn't add equalt to condition it will become an infinite loop beacuse s will always equal to e and the while loop will continue.
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }
}