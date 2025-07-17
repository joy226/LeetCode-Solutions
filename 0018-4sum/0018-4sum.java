class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int s = j + 1;
                int e = n - 1;
                while(s < e) {
                    long sum = (long)nums[i] + nums[j] + nums[s] + nums[e];
                    if(sum == target) {
                        ArrayList<Integer> row = new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[s]);
                        row.add(nums[e]);
                        result.add(row);
                        while(s < e && nums[s] == nums[s + 1]) s++;
                        while(s < e && nums[e] == nums[e - 1]) e--;
                        s++;
                        e--;
                    } else if (sum < target) {
                        s++;
                    } else {
                        e--;
                    }
                }
            }
        }
        return result;
    }
}