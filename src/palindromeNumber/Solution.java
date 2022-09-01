package palindromeNumber;

class Solution {
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder().append(x);
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(1441));
        System.out.println(Solution.isPalindrome(200));
        System.out.println(Solution.isPalindrome(-121));
        System.out.println(Solution.isPalindrome(121));
    }
}
