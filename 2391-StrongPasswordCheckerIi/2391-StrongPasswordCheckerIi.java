// Last updated: 7/8/2026, 4:46:21 PM
class Solution {
    public boolean strongPasswordCheckerII(String pass) {
     int len = pass.length();
     int a,b,c,d,e,f;
     if(len<8)return false;
     a=b=c=d=e=f=0;
     for(int i=0;i<len;i++){
        if(i > 0 && pass.charAt(i) == pass.charAt(i-1)) e = e + 1;
        else if(Character.isLowerCase(pass.charAt(i)))a=a+1;
        else if(Character.isUpperCase(pass.charAt(i)))b=b+1;
        else if(Character.isDigit(pass.charAt(i)))c=c+1;
        else if(pass.charAt(i)=='!'||pass.charAt(i)=='$'||pass.charAt(i)=='&'||pass.charAt(i)=='('||pass.charAt(i)=='-'||pass.charAt(i)=='@'||pass.charAt(i)=='%'||pass.charAt(i)=='*'||pass.charAt(i)==')'||pass.charAt(i)=='+'||pass.charAt(i)=='#'||pass.charAt(i)=='^')d=d+1;
        
     }
      
     return a > 0 && b > 0 && c > 0 && d > 0 && e == 0;
    }
}
