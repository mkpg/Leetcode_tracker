// Last updated: 7/8/2026, 4:48:13 PM
class Solution {
    public void reverseString(char[] s) {
        // char[] a = new char[s.length];
        
        int j = 0;
        for(int i=s.length-1;i>j;i--,j++){
            char b = s[j];
            s[j] = s[i]; 
            s[i] = b;
            
        }
        
    }}