// Last updated: 7/8/2026, 4:48:39 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode current = head,prev = null,next=null;
        while(current!=null){
            next = current.next;  //3|4|...
            current.next = prev;//1|2|...
            prev = current;//2|3|...
            current = next;//2=3==>3|3=4==>4|...
        }
        return prev;//null<-1<-2<-...
    }
}