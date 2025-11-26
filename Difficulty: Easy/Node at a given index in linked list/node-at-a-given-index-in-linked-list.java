/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        if (head==null){
            return -1;
        }
        
        Node dummy=head;
        
        int count=0;
        while (dummy!=null){
            count++;
            dummy=dummy.next;
        }
        
        if (count<index){
            return -1;
        }
        
        Node result=head;
        for (int i=0;i<index-1;i++){
            result=result.next;
        }
        
        return result.data;
        
    }
}