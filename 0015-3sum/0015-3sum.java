class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            // to avoid duplicate
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = nums[i] + nums[right] + nums[left];
                if(sum == 0) {
                    ArrayList<Integer> row = new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[left]);
                    row.add(nums[right]);
                    result.add(row);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
                
            }
        }
        return result;
    }
}