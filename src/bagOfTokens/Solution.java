package bagOfTokens;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j, len;
        j = len = tokens.length;
        while (i < j) {
            if (power >= tokens[i]) power -= tokens[i++];
            else if (i - (len - j) > 0 && j > i + 1) power += tokens[--j];
            else break;
        }
        return i - (len - j);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().bagOfTokensScore(new int[]{10, 20, 30, 40}, 0));
    }
}
