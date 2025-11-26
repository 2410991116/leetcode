/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if (head==null){
            return -1;
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        Collections.reverse(arr);
        
        if (k>arr.size()){
            return -1;
        }
        
        return arr.get(k-1);
        
        
    }
}