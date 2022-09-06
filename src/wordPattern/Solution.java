package wordPattern;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
            List<String> words = Arrays.asList(s.split("\\s"));
            if (pattern.length() != words.size()) {
                return false;
            }
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.indexOf(pattern.charAt(i)) != words.indexOf(words.get(i))) {
                    return false;
                }
            }
        return true;
    }
}
