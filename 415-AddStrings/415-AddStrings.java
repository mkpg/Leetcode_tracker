// Last updated: 7/8/2026, 4:47:50 PM
import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
         BigInteger num3 = new BigInteger(num1);
          BigInteger num4 = new BigInteger(num2);
        BigInteger a = num3.add(num4);
        return a.toString();
    }
}