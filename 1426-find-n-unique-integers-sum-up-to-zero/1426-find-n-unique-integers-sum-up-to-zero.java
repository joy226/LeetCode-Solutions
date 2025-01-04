class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int r = -(n / 2);
        for (int i = 0; i < n; i++) {
            ans[i] = r;
            r++;
            if(n % 2 == 0 && r == 0) {
                r++;
            }
        }
        return ans;
    }
}