// Last updated: 7/8/2026, 4:50:07 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor == -1) return 2147483647;
        return dividend/divisor;

        
    }
}