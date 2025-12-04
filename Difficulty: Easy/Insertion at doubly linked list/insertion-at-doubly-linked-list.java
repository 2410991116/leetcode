
class Solution {
    Node insertAtPos(Node head, int p, int x) {
        
        Node curr=new Node(x);
        
        Node temp=head;
        
        for (int i=0;i<p && temp!=null;i++){
            temp=temp.next;
        }
        
        if (temp==null){
            return head;
        }
        
        curr.next=temp.next;
        curr.prev=temp;
        
        if (temp.next!=null){
            temp.next.prev=curr;
        }
        
        temp.next=curr;
        
        return head;
    }
}