// Last updated: 7/8/2026, 4:47:16 PM
class MyLinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head,tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        Node temp = head;
        for(int i = 0;i<index;i++){
            if (temp == null) {
            return -1; 
        }
            temp = temp.next;}
            if(temp==null)return -1;
        return temp.val;
        }
    

    public void addAtHead(int val) {
        Node no = new Node(val);
        no.next = head;
        head = no;if (tail == null) {
        tail = head;
    }
    }

    public void addAtTail(int val) {
        Node no = new Node(val);
        if(tail==null){
            tail=no;
            head = no; 
        }
        else{
            tail.next = no;
            tail=no;
        }
    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        Node prev = head;
        for(int i=0;i<index-1;i++){
            if(prev==null) return;
            prev = prev.next;
        }
         if (prev == null) return;
         Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;

        if (newNode.next == null) {
            tail = newNode; // new tail if added at the end
        }
    }
    

    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            if (prev == null || prev.next == null) return;
            prev = prev.next;
        }

        if (prev.next == null) return;

        if (prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;
    }

    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

//  class  MyLinkedList {
//     String val;
//      MyLinkedList next;

//     public  MyLinkedList(String val) {
// 			this.val = val;
// 			next = null;
// 		}

//     public int get(int index) {
//          MyLinkedList n =new  MyLinkedList(data);
//         if(head == null){
//             System.out.print("empty");
//         }
//         else{
//              MyLinkedList temp = head;
//             for(int i = 1; i<pos ;i++){
//                 temp = temp.next;
//             }
//             System.out.print(temp);
//         }re
//     }

//     public void addAtHead(int val) {
//          MyLinkedList n =new  MyLinkedList(data);
//         if(head == null){
//             System.out.print("empty");
//         }
//         else{
//               MyLinkedList temp = head;
//              head.next=temp;
//              head = temp;
//         }
//     }

//     public void addAtTail(int val) {

//     }

//     public void addAtIndex(int index, int val) {

//     }

//     public void deleteAtIndex(int index) {

//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */