// Last updated: 7/8/2026, 4:48:45 PM
class Solution {
    public boolean isHappy(int n) {
        int t = 0;
        int d = 0;
        if(n==2)return false;
        else{
        while(n != 1 && n != 4){
            while(n>0){
                d = n%10;
                t = t+(d*d);
                n=n/10;
            }
            n=t;
            t=0; 
        }
        if(n==1)return true;
        else return false;}
        
    }
}