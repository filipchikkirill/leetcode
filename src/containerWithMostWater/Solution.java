package containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right) {
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min * (right - left));
            if (height[left] == min) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] given = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new Solution().maxArea(given));
    }
}
