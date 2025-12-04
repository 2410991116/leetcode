class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node result=new Node(x);
        
        if (head==null){
            return result;
        }
        
        if (head.data>x){
            result.next=head;
            head.prev=result;
            head=result;
            return head;
        }
        
        Node dummy=head;
        while (dummy.next!=null && dummy.next.data<x){
            dummy=dummy.next;
        }
        
        result.next=dummy.next;
        result.prev=dummy;
        
        if (dummy.next!=null){
            dummy.next.prev=result;
        }
        
        dummy.next=result;
        
        return head;
    }
}