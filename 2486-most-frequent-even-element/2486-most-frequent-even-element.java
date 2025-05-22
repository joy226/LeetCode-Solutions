class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        int result = -1;

        for (int num : nums) {
            if (num % 2 == 0) {
                int count = freqMap.getOrDefault(num, 0) + 1;
                freqMap.put(num, count);

                if (count > maxCount || (count == maxCount && num < result)) {
                    maxCount = count;
                    result = num;
                }
            }
        }

        return result;
    }
}