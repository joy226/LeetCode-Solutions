class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] tMatrix = new int[matrix[0].length][matrix.length];
        if(matrix.length == 0) {
            return matrix;
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }
        return tMatrix;
    }
}