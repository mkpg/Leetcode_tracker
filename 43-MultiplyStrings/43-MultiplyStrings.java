// Last updated: 7/8/2026, 4:50:02 PM
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return c.toString();

    // String aa = new StringBuilder(num1).reverse().toString();
    // String bb = new StringBuilder(num2).reverse().toString();
    //   char[] a = aa.toCharArray();
    //   char[] b = bb.toCharArray();
    //   long[] c = new long[a.length];
    //   long[] d = new long[b.length];
    //   for(int i=0;i<c.length;i++){
    //     c[i] = a[i]-'0'; 
    //   }
    //   for(int i=0;i<d.length;i++){
    //     d[i] = b[i]-'0'; 
    //   }

    //   // do 10 power i like i = 0  == 10 pow 0 = 1 *2 = 2
    //   double sum = 0;
    //   for(int i =c.length-1; i>=0 ;i--){
    //   sum = sum + Math.pow(10,i)*c[i] ;       
    //   }
    //   double add = 0;
    //   for(int i =d.length-1; i>=0 ;i--){
    //   add = add + Math.pow(10,i)*d[i] ;       
    //   }
    //   long y = (long)sum;
    //   long x = (long)add;
    //   long z = x*y;
    //   return String.valueOf(z);

    }
}