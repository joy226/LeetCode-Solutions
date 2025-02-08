class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zero = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    zero++;
                } else if (grid[i][j] == 1) {
                    // starting point find
                    a = i;
                    b = j;
                }
            }
        }
        return helper(a, b, grid, zero);
    }

    public int helper(int r, int c, int[][] grid, int zero) {
        int count = 0;
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == -1) {
            return 0;
        }
        if (grid[r][c] == 2) {
            return zero == -1 ? 1 : 0;
        }
        grid[r][c] = -1;
        zero--;
        count = helper(r + 1, c, grid, zero) + helper(r - 1, c, grid, zero) + helper(r, c + 1, grid, zero)
                + helper(r, c - 1, grid, zero);
        grid[r][c] = 0; // path is not correct.
        zero++;
        return count;
    }
}