// Last updated: 7/8/2026, 4:48:32 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int a = 0;
        for(int i = 0 ; i<31;i++){
            a = (int)Math.pow(2,i);
            if(n==a)return true;
        }
        return false;
    }
}