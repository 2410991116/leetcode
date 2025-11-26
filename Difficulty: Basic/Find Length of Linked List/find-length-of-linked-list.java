/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        Node dummy=head;
        
        int count=0;
        while (dummy!=null){
            dummy=dummy.next;
            count++;
        }
        
        return count;
    }
}