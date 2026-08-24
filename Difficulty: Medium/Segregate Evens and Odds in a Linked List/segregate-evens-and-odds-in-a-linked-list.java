class Solution {
    Node divide(Node head) {
        Node evens=new Node(0);
        Node even=evens;
        
        Node odds=new Node(0);
        Node odd=odds;
        
        Node temp=head;
        while (temp!=null){
            if (temp.data%2==0){
                even.next=temp;
                even=even.next;
            }else{
                odd.next=temp;
                odd=odd.next;
            }
            temp=temp.next;
        }
        
        even.next=odds.next;
        odd.next=null;
        
        return evens.next;
    }
}