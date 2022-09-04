package searchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        int low = 0, mid, hi = nums.length - 1;
        while (low <= hi){
            mid = low + (hi - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return low;
    }
}
