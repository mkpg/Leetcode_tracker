// Last updated: 7/8/2026, 4:49:39 PM
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return true;
        }
        return false;
    }
}