package lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return result;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon  "));
    }
}
