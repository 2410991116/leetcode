/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newnode=new Node(x);
        
        if (head==null){
            return newnode;
        }
        
        if (x<=head.data){
            newnode.next=head;
            head.prev=newnode;
            return newnode;
        }
        
        Node dummy=head;
        
        while (dummy.next!=null && dummy.data<x){
            dummy=dummy.next;
        }
        
        if (dummy.next==null && dummy.data<x){
            dummy.next=newnode;
            newnode.prev=dummy;
            return head;
        }
        
        Node temp=dummy.prev;
        temp.next=newnode;
        newnode.prev=temp;
        
        newnode.next=dummy;
        dummy.prev=newnode;
        
        return head;
        
    }
}