/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        if (head==null){
            return head;
        }
        
        Node dummy=head;
        
        while (dummy!=null && dummy.next!=null){
            if (dummy.data==dummy.next.data){
                dummy.next=dummy.next.next;
            }else{
                dummy=dummy.next;
            }
        }
        
        return head;
    }
}