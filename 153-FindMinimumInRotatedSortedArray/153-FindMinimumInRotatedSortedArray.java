// Last updated: 7/8/2026, 4:49:05 PM
class Solution {
    public int findMin(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(temp>nums[i]) temp=nums[i];
        }
        return temp;
    }
}