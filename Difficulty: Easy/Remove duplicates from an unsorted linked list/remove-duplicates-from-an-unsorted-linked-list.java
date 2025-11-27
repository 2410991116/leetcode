/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if (head==null){
            return head;
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node current=head;
        Node prev=null;
        
        while (current!=null){
            if (arr.contains(current.data)){
                prev.next=current.next;
            }else{
                arr.add(current.data);
                prev=current;
            }
            current=current.next;
        }
        
        return head;
    }
}