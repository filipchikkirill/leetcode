package reverseInteger;

public class Solution {
    public int reverse(int x) {
        try {
            if (x > 0) {
                return Integer.parseInt(new StringBuilder().append(x).reverse().toString());
            } else {
                return Integer.parseInt(new StringBuilder().append(x * (-1)).reverse().toString()) * (-1);
            }
        } catch (NumberFormatException ex) {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
        System.out.println(new Solution().reverse(-123));
        System.out.println(new Solution().reverse(-120));
        System.out.println(new Solution().reverse(1_534_236_469));
    }
}
