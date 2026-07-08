// Last updated: 7/8/2026, 4:46:48 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}