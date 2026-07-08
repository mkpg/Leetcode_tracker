// Last updated: 7/8/2026, 4:50:36 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode pre = temp;
        int carry = 0;
        int sum;
        while(l1!=null||l2!=null||carry!=0){
            int val1=0,val2=0;
            if(l1!=null){val1 = l1.val;l1 = l1.next;}
            if(l2!=null){val2=l2.val;l2 = l2.next;}
            sum = val1+val2+carry;
            carry = sum/10;
            pre.next = new ListNode(sum%10);
            pre = pre.next;
        }
        return temp.next;
    }
}
