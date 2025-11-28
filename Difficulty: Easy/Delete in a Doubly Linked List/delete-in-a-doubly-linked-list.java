/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if (head==null){
            return head;
        }
        
        if (x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        
        Node dummy=head;
        
        for (int i=1;i<x;i++){
            dummy=dummy.next;
        }
        
        dummy.prev.next=dummy.next;
        if (dummy.next!=null){
            dummy.next.prev=dummy.prev;
        }
        
        return head;
    }
}