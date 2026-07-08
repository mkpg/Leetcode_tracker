// Last updated: 7/8/2026, 4:50:19 PM
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        int i=0,j=0,k=0;
        for(i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> curr=new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    answer.add(curr);
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++; k--;
                }
                else if(sum<0) j++;
                else if(sum>0) k--;
            } 
        }return answer;
    }
}