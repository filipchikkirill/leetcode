package removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        if (nums.length >= 2) {
            int prev = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (prev == nums[i]) {
                    nums[i] = Integer.MAX_VALUE;
                    result--;
                } else {
                    prev = nums[i];
                }
            }
            Arrays.sort(nums);
        }
        return result;
    }

    public int removeDuplicatesFaster(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        System.out.println(new Solution().removeDuplicates(nums));
        System.out.println(new Solution().removeDuplicatesFaster(nums));
        System.out.println(Arrays.toString(nums));
    }
}
