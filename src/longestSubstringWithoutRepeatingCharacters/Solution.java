package longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }

        HashSet<Character> frameSet = new HashSet<>();
        int frameHeadId = 0;
        int frameTailId = 0;
        int frameSize = 0;
        while(frameTailId < s.length()){
            char c = s.charAt(frameTailId);
            if(frameSet.add(c)){
                frameTailId++;
            }
            else{
                frameSet.remove(s.charAt(frameHeadId));
                frameHeadId++;
            }
            frameSize = Math.max(frameSize,frameSet.size());
        }
        return frameSize;
    }
}
