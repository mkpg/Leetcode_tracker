// Last updated: 7/8/2026, 4:48:18 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int a ;
        for(int i=0;i<nums.length-1;i++){                              //i=0|0|0
            if(nums[i]==0){                                          //0=0|0|0
                for(int j=i+1;j<nums.length;j++){                      //j=1|0|3
                    if(nums[j]!=0){                                 //0=0|0|
                        a=nums[j];                                  //a=1|0|
                        nums[j]=nums[i];                         //1=0|0|
                        nums[i]=a;                               //0=1|0|
                        break;                                   //100312|100312|
                    }
                    else {continue;}
                }

            }
        }
    }
}

//                                          crt code          _____________________________________-----------------------_________________________________________
//  class Solution {
// public:
//     void moveZeroes(int[] nums) {
//         int a ;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==0){
//                 for(int j=i+1;j<=nums.length;j++){
//                     if(nums[j]!=0){
//                         a=nums[i];
//                         nums[i]=nums[j];
//                         nums[j]=a;
//                         break;
//                     }