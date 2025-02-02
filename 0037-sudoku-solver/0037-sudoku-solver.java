class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        // this is how we are replaceing the r, c from the arguments.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // check for an empyth place
                if (board[i][j] == '.') {
                    for (char number = '1'; number <= '9'; number++) {
                        if (isSafe(board, i, j, number)) {
                            board[i][j] = number;
                            if (solve(board)) {
                                // found the answer.
                                return true;
                            }
                            // backtrack
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        // if can't find any suitable answer.
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char number) {
        // check the row
        for (int i = 0; i < 9; i++) {
            // check is the number is already in the row or not if yes then return false.
            if (board[row][i] == number || board[i][col] == number) {
                return false;
            }
        }
        // chaeck the 3x3 grid
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}