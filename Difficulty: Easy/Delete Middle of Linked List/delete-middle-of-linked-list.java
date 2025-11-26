/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        if (head==null){
            return head;
        }
        
        Node dummy=head;
        int count=0;
        
        while (dummy!=null){
            dummy=dummy.next;
            count++;
        }
        
        int mid=count/2;
        
        if (mid == 0) { 
            return head.next;
        }

        
        Node result=head;
        
        for (int i=0;i<mid-1;i++){
            result=result.next;
        }
        
        result.next=result.next.next;
        
        return head;
        
        
        
        
        
        
        
        
        
        
    }
}