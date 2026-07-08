// Last updated: 7/8/2026, 4:46:26 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int a = num % 10;
        if(a==0) return false;
        return true;
    }
}