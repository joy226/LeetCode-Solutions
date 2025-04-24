class Solution {
    public int countCompleteSubarrays(int[] nums) {
        ArrayList<Integer> unique = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // Check if this element is included in result
            int j;
            for (j = 0; j < i; j++){
                if (nums[i] == nums[j]){
                    break;
                }
            }
            // Include this element if not included previously
            if (i == j){
                unique.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            HashSet<Integer> currentSubArray = new HashSet<Integer>();
            for(int j = i; j < nums.length; j++) {
                currentSubArray.add(nums[j]);
                if(currentSubArray.size() == unique.size()) {
                    count++;
                }
            }
        }
        return count;
    }
}