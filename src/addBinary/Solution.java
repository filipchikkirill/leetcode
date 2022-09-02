package addBinary;


import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);
        return x.add(y).toString(2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("101", "1001"));
    }
}
