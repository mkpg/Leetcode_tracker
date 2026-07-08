// Last updated: 7/8/2026, 4:47:08 PM
class Solution {
    public static void split(int[] arr){
        int len = arr.length;
        if(len<=1)return;
        int mid = len/2;
        int left[] =new int[mid];
        int right[] = new int[len-mid];
        int j = 0;
        for(int i = 0;i < len;i++){
            if(i<mid){
                left[i] = arr[i];
            }
            else{right[j] = arr[i];
            j++;
        }
    }
    split(left);
    split(right);
    merge(left,right,arr);
    }
   public static void merge(int[] larray,int[] rarray,int[] arr){
    int lsize = arr.length/2; // or start index - end index/2;
    int rsize = arr.length - lsize;
    int i=0 , ri = 0 , li =0;
    while(li<lsize && ri<rsize){
        if(larray[li]<rarray[ri]){
            arr[i] = larray[li];
            i++;
            li++;
        }
        else{
            arr[i] = rarray[ri];
            i++;
            ri++;
        }
    }
    while(li<lsize){
        arr[i] = larray[li];
        i++;
        li++;
    }
    while(ri<rsize){
        arr[i] = rarray[ri];
        i++;
        ri++;
    }
}
public int[] sortArray(int[] nums) {
        split(nums);
        return nums;

    }

    }
    
