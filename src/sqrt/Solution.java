package sqrt;

public class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) sqrt;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(10));
    }
}
