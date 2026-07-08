// Last updated: 7/8/2026, 4:48:04 PM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }   
        return a;     
    }
}