// Last updated: 7/8/2026, 4:49:04 PM
import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        // int a =Arrays.stream(nums).min().getAsInt();
        // return a;
        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            if(temp>nums[i]){
                temp=nums[i];
            }
        }
        return temp;
    }
}