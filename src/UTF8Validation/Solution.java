package UTF8Validation;

public class Solution {
    public boolean validUtf8(int[] data) {
        int count = 0;
        for (int element : data) {
            if (count == 0) {
                if (element >> 5 == 0b110) count = 1;
                else if (element >> 4 == 0b1110) count = 2;
                else if (element >> 3 == 0b11110) count = 3;
                else if (element >> 7 != 0) return false;
            } else {
                if (element >> 6 != 0b10) return false;
                else count--;
            }
        }
        return (count == 0);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().validUtf8(new int[]{197, 130, 1}));
    }
}
