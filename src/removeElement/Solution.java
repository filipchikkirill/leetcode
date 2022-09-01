package removeElement;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    nums[i] ^= nums[j];
                    nums[j] ^= nums[i];
                    nums[i] ^= nums[j];
                    i++;
                    count++;
                } else {
                    j--;
                }
            } else {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(new Solution().removeElement(nums, 2));
        Arrays.stream(nums).sequential().forEach(System.out::print);
    }
}
