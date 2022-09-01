package maxSumOfRectangleNoLargerThanK;

import java.util.TreeSet;

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int result = Integer.MIN_VALUE;

        for(int left = 0; left < matrix[0].length; left++) {

            int[] rSum = new int[matrix.length];

            for(int right = left; right < matrix[0].length; right++) {
                for(int row = 0; row < matrix.length; row++) {
                    rSum[row] += matrix[row][right];
                }
                TreeSet<Integer> set = new TreeSet<>();
                int cs = 0;
                set.add(cs);
                for(int a: rSum){
                    cs += a;
                    Integer target = set.ceiling(cs - k);
                    if (target !=null) {
                        result = Math.max(result, cs - target);
                    }
                    set.add(cs);
                }
            }
        }
        return result;
    }
}
