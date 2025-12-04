
class Solution {
    public Node delPos(Node head, int x) {
        
        if (head==null){
            return head;
        }
        
        if (x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        
        Node temp=head;
        for (int i=1;i<x;i++){
            temp=temp.next;
        }
        
        temp.prev.next=temp.next;
        
        if (temp.next!=null){
            temp.next.prev=temp.prev;
        }
        
        return head;
    }
}