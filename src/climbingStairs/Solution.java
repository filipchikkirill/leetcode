package climbingStairs;

public class Solution {
    public int climbStairs(int n) {
        int pre2 = 1;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            prev += pre2;
            pre2 = prev - pre2;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(10));
    }
}
