// Last updated: 7/8/2026, 4:50:13 PM
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
    public ListNode swapPairs(ListNode head) {
        ListNode n = new ListNode();
        n.next = head;
        ListNode temp = n;
        int cnt =0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        temp = n;
        for(int i=0;i<cnt-1;i+=2){
            if (temp.next == null || temp.next.next == null) break;
            ListNode fst = temp.next;
            ListNode snd = fst.next;
            fst.next = snd.next;
            snd.next = fst;
            temp.next = snd;
            temp = fst;
        }
        return n.next;
    }
}