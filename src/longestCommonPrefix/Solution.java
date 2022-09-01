package longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            int min = Math.min(sb.length(), strs[i].length());
            if (min == 0) return "";
            sb.delete(min, sb.length());
            for (int j = 0; j < min; j++) {
                if (sb.charAt(j) != strs[i].charAt(j)) {
                    sb.delete(j, sb.length());
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"aba", "a"}));
    }
}
