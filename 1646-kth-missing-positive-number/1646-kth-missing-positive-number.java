class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int missingCount = arr[mid] - (mid + 1); // Count of missing numbers up to arr[mid]

            if (missingCount < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        // At this point, 'low' is the index where if 'k' missing numbers exist,
        // the kth missing number would be just before arr[low] (or after the end if low == arr.length).

        // The number of missing integers before arr[low] is (low + 1) - arr[low].
        // We need to find the (k - missingCountBeforeLow)th missing number after the last element we considered.
        // If low == 0, then all k missing numbers are before arr[0].

        if (low == 0) {
            return k;
        } else {
            int missingCountBeforeLow = arr[low - 1] - low;
            return arr[low - 1] + (k - missingCountBeforeLow);
        }
    }
}