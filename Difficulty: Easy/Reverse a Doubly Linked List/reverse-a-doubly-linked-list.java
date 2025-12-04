/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if (head==null || head.next==null){
            return head;
        }
        
        Node dummy=head;
        Node temp=null;
        
        while (dummy!=null){
            temp=dummy.prev;
            dummy.prev=dummy.next;
            dummy.next=temp;
            
            dummy=dummy.prev;
        }
        
        if (temp!=null){
            head=temp.prev;
        }
        
        return head;
    }
}