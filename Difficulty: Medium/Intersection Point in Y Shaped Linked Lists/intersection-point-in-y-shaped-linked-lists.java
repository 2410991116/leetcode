/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Solution {
    Node intersectPoint(Node head1, Node head2) {
        // code here
        if (head1==null || head2==null){
            return null;
        }
        
        int len1=0,len2=0;
        Node dummy1=head1,dummy2=head2;
        
        while (dummy1!=null){
            len1++;
            dummy1=dummy1.next;
        }
        while (dummy2!=null){
            len2++;
            dummy2=dummy2.next;
        }
        
        dummy1=head1;
        dummy2=head2;
        
        int same=Math.abs(len1-len2);
        
        if (len1>len2){
            for (int i=0;i<same;i++){
                dummy1=dummy1.next;
            }
        }else{
            for (int i=0;i<same;i++){
                dummy2=dummy2.next;
            }
        }
        
        while (dummy1!=null && dummy2!=null){
            if (dummy1==dummy2){
                return dummy1;
            }
            dummy1=dummy1.next;
            dummy2=dummy2.next;
        }
        
        return null;
    }
}
