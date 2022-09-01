package powerOfThree;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        while (n > 3 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 3;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(1));
        System.out.println(new Solution().isPowerOfThree(2));
        System.out.println(new Solution().isPowerOfThree(3));
        System.out.println(new Solution().isPowerOfThree(9));
        System.out.println(new Solution().isPowerOfThree(27));
        System.out.println(new Solution().isPowerOfThree(28));
    }
}