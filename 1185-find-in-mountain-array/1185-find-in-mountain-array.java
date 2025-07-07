class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // 1. Find peak index
        int peak = findPeak(mountainArr, 0, n - 1);
        
        // 2. Search in ascending part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        // 3. Search in descending part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    // Find the peak index using binary search
    private int findPeak(MountainArray mountainArr, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Peak index
    }

    // Binary search in either ascending or descending order
    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean isAsc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = mountainArr.get(mid);
            if (value == target) return mid;
            
            if (isAsc) {
                if (value < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (value < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1; // Not found
    }
}
