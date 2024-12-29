class Solution {
    public int largestAltitude(int[] gain) {
        // return helper(gain, 0);
        int altitude = 0;
        int maxAltitude = 0;
        for(int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if(altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }

    // public int helper(int[] arr, int i) {
    //     int sum = 0;
    //     int[] nums = new int[arr.length + 1];
    //     if(arr.length == i) {
    //         return max(nums);
    //     }
    //     nums[i] = sum;
    //     return helper(arr, i + 1);
    // }
    // public int max(int[] arr) {
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++) {
    //         if(max < arr[i]) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;

    // }
}