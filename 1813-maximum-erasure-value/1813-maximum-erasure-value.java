class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        while(right < nums.length) {
            sum += nums[right];
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while(freq.get(nums[right]) > 1) {
                sum -= nums[left];
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if(freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }
            if(maxSum < sum) {
                maxSum = sum;
            }
            right++;
        }
        return maxSum;
    }
}