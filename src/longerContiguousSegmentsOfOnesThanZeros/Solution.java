package longerContiguousSegmentsOfOnesThanZeros;

class Solution {
    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int oneMaxCount = 0;
        int zeroMaxCount = 0;
        int curCharSeq = 0;
        char curChar = chars[0];
        for (char ch: chars) {
            if (curChar == ch) {
                curCharSeq++;
            } else {
                if (curChar == '1') {
                    oneMaxCount = Math.max(oneMaxCount, curCharSeq);
                } else {
                    zeroMaxCount = Math.max(zeroMaxCount, curCharSeq);
                }
                curChar = ch;
                curCharSeq = 1;
            }
        }

        if (curChar == '1') {
            oneMaxCount = Math.max(oneMaxCount, curCharSeq);
        } else {
            zeroMaxCount = Math.max(zeroMaxCount, curCharSeq);
        }

        return oneMaxCount > zeroMaxCount;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkZeroOnes("111000"));
    }
}
