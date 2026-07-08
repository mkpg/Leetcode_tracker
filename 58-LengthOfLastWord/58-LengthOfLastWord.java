// Last updated: 7/8/2026, 4:49:52 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        int b = a.length;
        String c = a[b-1];
        int cn = 0;
        for(int i=0;i<c.length();i++){
            cn++;
        }
        return cn;
        }
    }
