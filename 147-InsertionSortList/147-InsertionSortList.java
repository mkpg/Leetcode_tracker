// Last updated: 7/8/2026, 4:49:10 PM
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
    public ListNode insertionSortList(ListNode head) {

        
        for(ListNode i = head;i!=null;i=i.next){
            ListNode mid = i;
            for(ListNode j =i.next;j!=null;j = j.next ){
                if(j.val<mid.val){mid = j;}}
                    int str = i.val;
                    i.val = mid.val;
                    mid.val = str;
                }
            return head;
        }
        
    }

// class Solution {
//     public ListNode insertionSortList(ListNode head) {
//         ListNode temp = head;
//         ListNode tnx = temp.next;
//        for(ListNode i =tnx;i!=null; i = i.next){
//         int val = i.val;
//         ListNode j = temp;
//         while(j>=temp && j.val>val){
//             tnx = j;
//             j = temp;
//         }
//         j.next.val = val;
//        }
//     }
// }