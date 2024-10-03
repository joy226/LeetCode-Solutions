class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                  swap(nums, i, correct);
                } else {
                  return nums[i];
                }
            }
            else { 
                i++;
            } 
        }
        return -1;
    }
    public void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}