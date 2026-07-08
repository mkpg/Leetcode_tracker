// Last updated: 7/8/2026, 4:46:55 PM
class Solution {
    public int maximum69Number (int num) {
        
        String s = String.valueOf(num);

        s = s.replaceFirst("6", "9");

        return Integer.parseInt(s);
    }
}
