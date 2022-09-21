package sumOfEvenNumbersAfterQueries;

import java.util.Arrays;

public class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .sum();
        int[] res = new int[nums.length];
        int i = 0;
        for (int[] val : queries) {
            if (nums[val[1]] % 2 == 0) {
                evenSum -= nums[val[1]];
            }

            nums[val[1]] += val[0];

            if (nums[val[1]] % 2 == 0) {
                evenSum += nums[val[1]];
            }

            res[i] = evenSum;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        System.out.println(Arrays.toString(new Solution().sumEvenAfterQueries(nums, queries)));
    }
}