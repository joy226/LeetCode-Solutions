class Solution {
    public int countNicePairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> diffCounts = new HashMap<>();

        for (int num : nums) {
            int reversedNum = rev(num);
            int diff = num - reversedNum;
            count = (count + diffCounts.getOrDefault(diff, 0)) % 1000000007;
            diffCounts.put(diff, diffCounts.getOrDefault(diff, 0) + 1);
        }

        return count;
    }
    public int rev(int num) {
        int reverse = 0;
        while(num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        return reverse;
    }
}