// Last updated: 7/8/2026, 4:46:03 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x%(sum(x))==0){
            return sum(x);
        }
        else{
            return -1;
        }
    }
    public static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
            }
            return sum;
    }
}