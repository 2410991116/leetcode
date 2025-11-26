/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        if (head==null){
            return 0;
        }
        
        Node dummy=head;
        int count=0;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        
        int mid=count/2;
        
        
        Node result=head;
        for (int i=0;i<mid;i++){
            result=result.next;
        }
        
        return result.data;
        
    }
}