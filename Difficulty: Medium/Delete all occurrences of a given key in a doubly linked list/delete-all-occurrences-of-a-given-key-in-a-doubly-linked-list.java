// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if (head==null ){
            return head;
        }
        
        while (head!=null && head.data==x){
            head=head.next;
            if (head!=null){
                head.prev=null;
            }
        }
        
        if (head==null){
            return head;
        }
        
        Node dummy=head.next;
        
        while (dummy!=null){
            if (dummy.data==x){
                dummy.prev.next=dummy.next;
                
                if (dummy.next!=null){
                    dummy.next.prev=dummy.prev;
                }
            }
            dummy=dummy.next;
        }
        
        return head;
    }
}