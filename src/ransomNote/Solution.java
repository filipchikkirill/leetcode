package ransomNote;


public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for(char ch: magazine.toCharArray()) {
            alphabet[ch - 'a']++;
        }
        for(char ch: ransomNote.toCharArray()) {
            int val = ch - 'a';
            if(alphabet[val] <= 0) return false;
            alphabet[val]--;
        }
        return true;
    }

}
