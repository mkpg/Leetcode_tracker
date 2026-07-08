// Last updated: 7/8/2026, 4:50:10 PM
class Solution {
    public int removeElement(int[] nums, int val) {
//         int[] temp = new int[nums.length];  
//         int gh;
//         int a = nums.length;

//         int index = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 temp[index] = nums[i];
//                 index++;
//             }
//         }

//         for (int i = 0; i < a; i++) {
//             if (temp[i] == 0) {
//                 for (int j = i; j < a - 1; j++) {
//                     gh = temp[j];
//                     temp[j] = temp[j + 1];
//                     temp[j + 1] = gh;
//                 }
//                 a--;
//             }
//         }

//         for (int i = 0; i < a; i++) {
//             return temp[i];
//         }return 0;
//     }
// }
int c = 0;
for(int i=0;i<nums.length;i++){
if(nums[i]!=val){
nums[c]=nums[i]; c++;
}
}
return c;    }
    }








    
