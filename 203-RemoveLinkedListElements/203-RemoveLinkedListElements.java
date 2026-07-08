// Last updated: 7/8/2026, 4:48:44 PM
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

    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val)head = head.next;
        ListNode temp = head;
        while(temp !=null && temp.next!= null){
            if(temp.next.val == val){temp.next=temp.next.next;}
            else {temp=temp.next;}
        }return head;
    }
}