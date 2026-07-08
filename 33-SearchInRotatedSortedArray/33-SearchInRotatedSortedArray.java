// Last updated: 7/8/2026, 4:50:06 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }return -1;
    }
}