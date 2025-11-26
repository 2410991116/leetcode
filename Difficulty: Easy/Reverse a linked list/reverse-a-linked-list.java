/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        Collections.reverse(arr);
        
        Node result=new Node(arr.get(0));
        Node curr=result;
        
        for (int i=1;i<arr.size();i++){
            curr.next=new Node(arr.get(i));
            curr=curr.next;
        }
        
        return result;
        
        
        
    }
}