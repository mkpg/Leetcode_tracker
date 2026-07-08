// Last updated: 7/8/2026, 4:48:10 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1){ return true;}
        if(n<=0) return false;
        if(n%3!=0)return false;
        
        return(isPowerOfThree(n/3));
        
        }
    
}