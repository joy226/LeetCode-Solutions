class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int operations = 0;

        for (int j = 0; j < n; j++) {
            int prev = -1;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] <= prev) {
                    operations += prev - grid[i][j] + 1;
                    grid[i][j] = prev + 1;
                }
                prev = grid[i][j];
            }
        }

        return operations;
    }
}