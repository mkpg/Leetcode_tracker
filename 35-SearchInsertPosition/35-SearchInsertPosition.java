// Last updated: 7/8/2026, 4:50:01 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target) return i;
            if(target>nums[i]) return i+1;
        }
        return 0;
    }
}