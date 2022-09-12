package checkIfMatrixIsXMatrix;

public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length - 1;
        for (int i = 0; i <= len ; i++) {
            for (int j = 0; j <= len; j++) {
                if (i == j || (i == len && j == 0) || (len - i) == (j)) {
                    if (grid[i][j] == 0) return false;
                } else {
                    if (grid[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}
