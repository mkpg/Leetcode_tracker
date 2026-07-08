// Last updated: 7/8/2026, 4:46:39 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)+coordinates.charAt(1))%2!=0) return true;
        else return false;
    }
}