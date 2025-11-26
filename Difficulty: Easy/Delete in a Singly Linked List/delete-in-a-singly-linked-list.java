/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if (head==null){
            return head;
        }
        
        if (x==1){
            return head.next;
        }
        
        Node result=head;
        for (int i=1;result!=null && i<x-1;i++){
            result=result.next;
        }
        
        if (result==null && result.next==null){
            return head;
        }
        
        result.next=result.next.next;
        
        return head;
        
    }
}