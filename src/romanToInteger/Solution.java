package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final static Map<Character, Integer> romanNumbers;
    static {
        romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s.isEmpty()) return 0;
        int result = romanNumbers.get(s.charAt(s.length() - 1));
        if (s.length() == 1) return result;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanNumbers.get(s.charAt(i)) >= romanNumbers.get(s.charAt(i + 1))) {
                result += romanNumbers.get(s.charAt(i));
            } else {
                result -= romanNumbers.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("XXII"));
    }
}
