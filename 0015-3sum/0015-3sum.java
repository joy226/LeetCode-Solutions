class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int s = i + 1;
            int e = n - 1;

            while(s < e) {
                int total = nums[i] + nums[s] + nums[e];

                if(total > 0) {
                    e--;
                } else if (total < 0) {
                    s++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    s++;

                    while(nums[s] == nums[s - 1] && s < e) {
                        s++;
                    }
                }
            }
        }
        return result;
    }
}