/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        // code here
        if (head==null){
            return head;
        }
        
        if (head.data==key){
            
            if (head.next==head){
                return null;
            }
            
            Node last=head;
            while (last.next!=head){
                last=last.next;
            }
            
            last.next=head.next;
            head=head.next;
            
            return head;
        }
        
        Node dummy=head;
        while (dummy.next!=head){
            if (dummy.next.data==key){
                dummy.next=dummy.next.next;
                return head;
            }
            dummy=dummy.next;
        }
        
        return head;
    }
}