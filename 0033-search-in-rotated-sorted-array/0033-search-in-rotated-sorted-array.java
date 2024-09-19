class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotIndexInArray(nums);
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0] <= target){
            return BinarySearch(nums, target, 0, pivot - 1);
        } else {
            return BinarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // int mid = start + end / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
    return -1;

    }

    static int pivotIndexInArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
} 