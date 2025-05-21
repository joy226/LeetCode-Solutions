class Solution {
    public boolean check(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                while (i < nums.length - 2) {
                    if (nums[i + 1] <=nums[i + 2]) {
                        i++;
                    }
                    else{
                        return false;
                    }

                }
                if(nums[0]<nums[i+1]){
                    return false;
                }

            }
        }
    return true;
    }
}