package rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (matrix[j][i] == matrix[i][j]) continue;
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                if (matrix[i][matrix.length - 1 - j] == matrix[i][j]) continue;
                matrix[i][matrix.length - 1 - j] ^= matrix[i][j];
                matrix[i][j] ^= matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] ^= matrix[i][j];
            }
        }
    }
}
