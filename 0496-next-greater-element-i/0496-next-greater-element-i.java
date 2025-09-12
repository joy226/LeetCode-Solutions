class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int x = 0;
            for(int j = 0; j < m; j++) {
                if(nums1[i] == nums2[j]) {
                    x = j;
                    break;
                }
            }
            if(x != m - 1) {
                int k = x + 1;
            while(k < m) {
                if(nums2[x] < nums2[k]) {
                    ans[i] = nums2[k];
                    break;
                } else {
                    ans[i] = -1;
                    k++;
                }
            }
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}