package sortTheMatrixDiagonally;

public class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int matWidth = mat.length;
        int matHeight = mat[0].length;
        int i = 0;
        int k = 0;
        int count = 0;
        while(count < matHeight + matWidth) {
            if(i == matWidth-1 && k < matHeight) {
                k++;
            }
            if(i != matWidth-1) {
                i++;
            }
            pass(mat, matWidth - 1 - i, k, matWidth, matHeight);
            count++;
        }
        return mat;
    }

    public void pass(int[][] a, int row, int col, int n, int m){

        int[] arr = new int [101];
        int i = row;
        int j = col;
        while (row < n && col < m) {
            arr[a[row++][col++]]++;
        }
        for (int k = 0; k < 101; k++) {
            if (arr[k] > 0) {
                while (arr[k] != 0) {
                    a[i++][j++] = k;
                    arr[k]--;
                }
            }
        }
    }
}
