package moveZeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
                nums[nums.length - 1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {0};
        new Solution().moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }
}
