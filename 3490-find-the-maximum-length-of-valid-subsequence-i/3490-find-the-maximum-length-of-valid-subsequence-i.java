class Solution {
    public int maximumLength(int[] nums) {
        
        int count_even = 0;
        int count_odd = 0;
        for(int num : nums) {
            if(num % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }
        int evenDp = 0;
        int oddDp = 0;
        for(int num : nums) {
            if(num % 2 == 0) {
                evenDp = Math.max(evenDp, oddDp + 1);
            } else {
                oddDp = Math.max(oddDp, evenDp + 1);
            }
        }
        return Math.max(Math.max(oddDp, evenDp), Math.max(count_odd, count_even));
    }
}