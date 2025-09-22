import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        int count = 0;

        // Build frequency map
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            max = Math.max(max, freq.get(num));
        }

        // Count how many numbers have this max frequency
        for (int f : freq.values()) {
            if (f == max) {
                count++;
            }
        }

        return max * count;
    }
}
