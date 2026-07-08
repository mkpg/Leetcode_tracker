// Last updated: 7/8/2026, 4:46:38 PM
class Solution {
    public int arraySign(int[] nums) {
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==0) return 0;
                    }
    for(int i = 0;i<nums.length;i++){
        if(nums[i]>0) nums[i] = 1;
        if(nums[i]<0) nums[i] =-1;
    }
    int p = 1;
    for(int i = 0 ;i<nums.length;i++){
        p = p*nums[i];
    }
    return p;
    }
}