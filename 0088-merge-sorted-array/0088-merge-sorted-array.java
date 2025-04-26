class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m + n];
        int i = 0; // pointer for nums1
        int j = 0; // pointer for nums2
        int k = 0; // pointer for mix

        // Merge elements from nums1 and nums2 into mix until one of the arrays is exhausted
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from nums1
        while (i < m) {
            mix[k] = nums1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from nums2
        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }

        // Copy the merged array back into nums1
        for (int l = 0; l < m + n; l++) {
            nums1[l] = mix[l];
        }
    }
}