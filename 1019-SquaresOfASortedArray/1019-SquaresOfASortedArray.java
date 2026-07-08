// Last updated: 7/8/2026, 4:47:03 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0 ; i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}