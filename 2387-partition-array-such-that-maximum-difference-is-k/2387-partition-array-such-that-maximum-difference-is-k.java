class Solution {
    public int partitionArray(int[] nums, int k) {
        if(nums.length == 0) {
            return 0;
        }
        // int[] sortedNums = sort(nums);
        Arrays.sort(nums);
        int count  = 0;
        long minVal = -1;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(count == 0 || (long)num - minVal > k) {
                count++;
                minVal = num;
            }
        }
        return count;
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, rigth);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mix array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it will be possible that one of the array is mot complete then we need to add all the remaining element into the mix array.
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}