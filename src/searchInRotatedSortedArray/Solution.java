package searchInRotatedSortedArray;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int hi = nums.length - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && nums[mid] > target) {
                    hi = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[hi] >= target) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    public int searchNotLogN(int[] nums, int target) {
        List<Integer> que = Arrays.stream(nums).boxed().toList();
        return que.indexOf(target);
    }
}
