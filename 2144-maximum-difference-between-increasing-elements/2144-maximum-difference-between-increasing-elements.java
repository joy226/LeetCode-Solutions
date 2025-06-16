class Solution {
    public int maximumDifference(int[] nums) {
        // boolean isTrue = true;
        int dif = -1;
        int max = -1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] > nums[i]) {
                    dif = nums[j] - nums[i];
                    if(dif > max) {
                        max = dif;
                    }
                }
            }
        }
        return max;
    }
}