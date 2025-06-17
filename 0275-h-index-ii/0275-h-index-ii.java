class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int s = 0;
        int e = n - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            int h = n - mid;
            if(citations[mid] == h) {
                return h;
            } else if(citations[mid] < h) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return n - s;
    }
}