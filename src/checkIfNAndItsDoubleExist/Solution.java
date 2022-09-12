package checkIfNAndItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length < 2) return false;
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.add(j) && j == 0) return true;
        }
        for (int i: arr) {
            if (set.contains(i * 2) && i != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }
}
