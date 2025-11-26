/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        return arr;
    }
}