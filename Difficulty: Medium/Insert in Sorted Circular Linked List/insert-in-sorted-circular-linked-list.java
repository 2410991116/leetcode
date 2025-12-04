/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int key) {
        // code here
        Node newn=new Node(key);
        
        if (head==null){
            newn.next=newn;
            return newn;
        }
        
        if (key<=head.data){
            Node last=head;
            while (last.next!=head){
                last=last.next;
            }
            last.next=newn;
            newn.next=head;
            
            return newn;
        }
        
        Node dummy=head;
        while (dummy.next!=head && dummy.next.data<key){
            dummy=dummy.next;
        }
        
        newn.next=dummy.next;
        dummy.next=newn;
        
        return head;
    }
}