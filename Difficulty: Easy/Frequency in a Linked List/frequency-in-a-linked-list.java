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
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        // code here
        if (head==null){
            return 0;
        }
        
        Node dummy=head;
        int count=0;
        while (dummy!=null){
            if (dummy.data==key){
                count++;
                dummy=dummy.next;
            }else{
                dummy=dummy.next;
            }
        }
        
        return count;
    }
}