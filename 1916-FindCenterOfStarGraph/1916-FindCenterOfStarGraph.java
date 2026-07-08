// Last updated: 7/8/2026, 4:46:41 PM
class Solution {
    public int findCenter(int[][] e) {
        return e[0][0]==e[1][0] || e[0][0] == e[1][1]?e[0][0]:e[0][1];
    }
}