// Last updated: 7/8/2026, 4:50:43 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr1 = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr1[i] = nums1[i];
        }
        double temp = 0;
        for (int i = nums1.length, j = 0; i < arr1.length; i++, j++) {
            arr1[i] = nums2[j];
        }
        
        Arrays.sort(arr1);
        if (arr1.length % 2 == 0){
        //     for (int i = 0; i < arr1.length; i++) {
        //         temp = temp + arr1[i];
        //     }
        //     temp = temp / arr1.length;
        // }
            temp = (arr1[(arr1.length-1)/2] + arr1[arr1.length / 2]);
            temp=temp/2;
        }
        else {
            // temp = Math.abs((arr1[arr1.length/2])+(arr1[arr1.length/2])+1)/2;
            temp = arr1[arr1.length/2];
        }return temp;
    }
}