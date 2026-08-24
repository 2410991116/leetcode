
class Solution {
    public Node partition(Node head, int x) {
        Node smaller=new Node(0);
        Node small=smaller;
        
        Node equaler=new Node(0);
        Node equal=equaler;
        
        Node larger=new Node(0);
        Node large=larger;
        
        Node temp=head;
        while (temp!=null){
            if(temp.data<x){
                small.next=temp;
                small=small.next;
            }else if (temp.data==x){
                equal.next=temp;
                equal=equal.next;
            }else{
                large.next=temp;
                large=large.next;
            }
            temp=temp.next;
        }
        
        
        large.next = null;

        if (equaler.next != null) {
            small.next = equaler.next;
        }
        else {
            small.next = larger.next;
        }

        if (equaler.next != null) {
            equal.next = larger.next;
        }

        if (smaller.next != null) {
            return smaller.next;
        }
        else if (equaler.next != null) {
            return equaler.next;
        }
        else {
            return larger.next;
        }
    }
};