class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        // it will be possible that one of the array is mot complete then we need to add all the remaining element into the mix array.
        while (i < nums1.length) {
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
        if(mix.length % 2 == 0) {
            return ((double) mix[mix.length / 2 - 1] + (double) mix[mix.length / 2]) / 2.0;
        }
        return mix[mix.length / 2];
    }
}