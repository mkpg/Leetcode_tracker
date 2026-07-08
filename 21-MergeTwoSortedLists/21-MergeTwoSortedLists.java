// Last updated: 7/8/2026, 4:50:14 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n = new ListNode();
        ListNode temp = n;
        while(list1 != null && list2 !=null){ 
        if(list1.val < list2.val){
            temp.next = list1;
            list1 = list1.next;
        }
        else {
            temp.next = list2;
            list2 = list2.next;
        }
        // else{temp.next=list1;temp.next.next=list2;}
        temp=temp.next;
        }
        if(list1!=null)temp.next=list1;
        else temp.next=list2;
        
        // temp.next = list1 || list2;
        return n.next;
    }
}