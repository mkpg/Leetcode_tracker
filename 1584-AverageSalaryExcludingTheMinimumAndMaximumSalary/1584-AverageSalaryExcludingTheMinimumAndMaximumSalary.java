// Last updated: 7/8/2026, 4:46:49 PM
class Solution {
    public double average(int[] sal) {
        Arrays.sort(sal);
        double g = 0,c=0;
        for(int i=1;i<sal.length-1;i++){
            g = g + sal[i];
            c++;
        }
        return (g/c);

    }
}