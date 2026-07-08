// Last updated: 7/8/2026, 4:46:31 PM
class Solution {
    public int mostWordsFound(String[] s) {
         int [] a = new int[s.length];
        for(int i = 0;i<s.length;i++){
        a[i] = s[i].split(" ").length;
        
        }
        Arrays.sort(a);
        
        return a[a.length-1];
        }
    }
