package trappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length -1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;
        while (left < right) {
            if ( height[left] < height[right]) {
                if (maxLeft < height[left]) {
                    maxLeft = height[left++];
                } else {
                    water += (maxLeft - height[left++]);
                }
            } else {
                if (maxRight < height[right]) {
                    maxRight = height[right--];
                } else {
                    water += (maxRight - height[right--]);
                }
            }
        }
        return water;
    }

    public static void main(String[] args) {
        /*
         * wwww             4
         * ww__             2
         * ____             0
         * wwwwwwwwww       10
         * www__            3
         * ww___            2
         * wwwww            5
         *
         * _ = 11
         * */
        System.out.println(new Solution().trap(new int[]{4, 2, 0, 10, 3, 2, 5}));
    }

}
