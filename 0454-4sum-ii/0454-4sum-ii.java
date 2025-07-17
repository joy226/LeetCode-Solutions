class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer, Integer> list = new HashMap<>();
        for(int a : nums1) {
            for(int b : nums2) {
                int sum = a + b;
                list.put(sum, list.getOrDefault(sum, 0) + 1);
            }
        }

        for(int c : nums3) {
            for(int d : nums4) {
                int sum = c + d;
                count += list.getOrDefault(-sum, 0);
            }
        }
        return count;
    }
}