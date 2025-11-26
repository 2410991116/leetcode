/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        if (head==null){
            return new Node(x);
        }
        
        Node dummy=head;
        
        int count=0;
        while (dummy.next!=null){
            dummy=dummy.next;
            count++;
        }
        
        int mid=count/2;
        
        
        Node result=head;
        
        for (int i=0;i<mid;i++){
            result=result.next;
        }
        
        Node newn=new Node(x);
        newn.next=result.next;
        result.next=newn;
        
        return head;
    }
}