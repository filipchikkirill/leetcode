package numberOfRectanglesThatCanFormTheLargestSquare;

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int[] rectangle : rectangles) {
            int minMAX = Math.min(rectangle[0], rectangle[1]);
            if (minMAX > max) {
                count = 1;
                max = minMAX;
                continue;
            }
            if (minMAX == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        System.out.println(new Solution().countGoodRectangles(rectangles));
    }
}
