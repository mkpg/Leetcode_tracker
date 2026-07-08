// Last updated: 7/8/2026, 4:48:28 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp= temp.next;
        }
        temp = head;
        int[] arr = new int[c];
        for(int i=0;i<c;i++){
            arr[i] = temp.val;
            temp=temp.next;
            System.out.print(arr[i]);
        }
       int l = 0;
       int r = c-1;
       while(l < r){
        if(arr[l]!=arr[r]){
            return false;
        }
        l++;r--;
       }
        return true;
    }
}