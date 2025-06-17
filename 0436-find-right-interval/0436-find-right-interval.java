class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int minIndex = -1;
            int minStart = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                // Find a candidate where start >= end of current interval
                if (intervals[j][0] >= intervals[i][1]) {
                    // Choose the smallest start (to satisfy "right interval")
                    if (intervals[j][0] < minStart) {
                        minStart = intervals[j][0];
                        minIndex = j;
                    }
                }
            }

            result[i] = minIndex;
        }

        return result;
    }
}
