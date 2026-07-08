// Last updated: 7/8/2026, 4:46:11 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int i = 0;i<hours.length;i++){
            if(hours[i]>= target) c++;
        }
        return c;
    }
}