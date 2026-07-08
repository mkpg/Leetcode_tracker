// Last updated: 7/8/2026, 4:49:34 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n];
        // int c = 0;
        for(int i = 0 ;i<m;i++){
            arr[i] = nums1[i];
        }
        
        for(int i=m,j = 0;i<m+n && j<n ;i++,j++){
            arr[i]=nums2[j];
        }
        for(int i = 0 ; i < m+n ; i++){
            nums1[i] = arr[i];
        }
        Arrays.sort(nums1);
        // System.out.print(Arrays.toString(arr));
    
    }
}