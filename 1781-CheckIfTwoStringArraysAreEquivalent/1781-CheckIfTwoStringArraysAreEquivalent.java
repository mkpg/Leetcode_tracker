// Last updated: 7/8/2026, 4:46:45 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String z = "";
        for(String a : word1){
            z = z+a;
        }
         String x = "";
        for(String b : word2){
            x = x+b;
        }
        return z.equals(x);
    }
}