class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); // in the end of the loop it will contain the max item of the array
            end += nums[i];
        }
        // binary search
        while(start < end){
            //try or the middle as potential answer
            int mid = start + (end - start) / 2;
            // calaculaate how many peaces we can divide this in with th emax sum
            int sum = 0;
            int pieaces = 1;
            for(int num: nums){
                if(sum + num > mid){
                    //we can not add in this sub array, make new one
                    // say we add this num in the new subarray, then sum = num
                    sum = num;
                    pieaces++;
                } else {
                    sum += num;
                }
            }
            if(pieaces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start; //or we can return the end because both have the answer
    }
}