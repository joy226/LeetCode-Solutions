/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int firstHalf = search(mountainArr, target, 0, peak, true);
        if(firstHalf != -1) {
            return firstHalf;
        }
        return search(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    public int findPeak(MountainArray arr) {
        int s = 0;
        int e = arr.length() - 1;
        while(s < e) {
            int mid = s + (e - s) / 2;
            if(arr.get(mid) > arr.get(mid + 1)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public int search(MountainArray arr, int target, int s, int e, boolean isAss) {
            while(s <= e) {
                int mid = s + (e - s) / 2;
                int value = arr.get(mid);
                if(value == target) {
                    return mid;
                }
                if(isAss) {
                    if(value > target) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                } else {
                    if(value > target) {
                        s = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                }
            }
        return -1;
    }
}
