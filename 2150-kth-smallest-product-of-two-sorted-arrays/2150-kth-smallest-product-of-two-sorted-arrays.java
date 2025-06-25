class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        // long[] res = new long[nums1.length * nums2.length];
        // int index = 0;
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         res[index++] = (long) nums1[i] * nums2[j]; // cast to long to avoid overflow
        //     }
        // }
        // Arrays.sort(res);
        // return res[(int)k - 1];

        long l = -10000000000L;
        long r = 10000000000L;

        while(l < r) {
            long m = l + (r - l) / 2;
            if(countProduct(nums1, nums2, m) < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    private long countProduct(int[] nums1, int[] nums2, long target) {
        long count = 0;
        for(int num1: nums1) {
            if(num1 == 0) {
                if(target >= 0) {
                    count += nums2.length;
                }
                continue;
            }
            int low = 0;
            int high = nums2.length;
            while(low < high) {
            int mid = low + (high - low) / 2;
            long product = (long) num1 * nums2[mid];
            if(product <= target) {
                if(num1 > 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            } else {
                if(num1 > 0) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        count += (num1 > 0) ? low : nums2.length - low;
        }
        return count;
    }
}