package plusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{8, 9, 9, 9, 9, 9, 9, 9, 9, 9 ,9 ,9, 9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9 ,9 ,9, 9})));

    }
}
