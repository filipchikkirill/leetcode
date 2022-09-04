package numbersWithSameConsecutiveDifferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
//    private static final int[] COUNT_OF_ONE = {
//            0,
//            1,
//            11,
//            111,
//            1_111,
//            11_111,
//            111_111,
//            1_111_111,
//            11_111_111,
//            111_111_111};
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        if (k == 0) {
            // Math.pow(10,2) this can be replaced by COUNT_OF_ONE[n]
            return result.stream().mapToInt(a -> a * (int)((Math.pow(10, n) - 1) / 9)).toArray();
        }
        for (int i = 2; i <= n; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int x : result) {
                int y = x % 10;
                if (y + k < 10) {
                    cur.add(x * 10 + y + k);
                }
                if (y - k >= 0) {
                    cur.add(x * 10 + y - k);
                }
            }
            result = cur;
        }
        return result.stream().mapToInt(a->a).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().numsSameConsecDiff(9, 0)));
    }
}
