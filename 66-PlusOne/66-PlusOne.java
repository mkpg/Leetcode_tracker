// Last updated: 7/8/2026, 4:49:55 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=(digits[i]+1);
                return digits;
            }
            digits[i] = 0;
            }
            
             int[] arr = new int[len+1];
            arr[0]=1;
            return arr;
        }
       
    }
