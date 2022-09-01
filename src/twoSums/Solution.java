package twoSums;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(target - nums[i])) {
                return new int[]{aMap.get(target - nums[i]), i};
            }
            aMap.put(nums[i], i);
        }
        return new int[]{1,-1};
    }
}
