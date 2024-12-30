class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] tMatrix = new int[m][n];
        if(matrix.length == 0) {
            return matrix;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }
        return tMatrix;
    }
}