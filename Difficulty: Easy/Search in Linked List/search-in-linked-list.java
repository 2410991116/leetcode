/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if (head==null){
            return false;
        }
        
        Node dummy=head;
        
        while (dummy!=null){
            if (dummy.data==key){
                return true;
            }else{
                dummy=dummy.next;
            }
        }
        
        return false;
    }
}