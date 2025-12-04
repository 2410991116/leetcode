/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        if (head==null || head.next==null){
            return head;
        }
        
        Node result=head;
        
        while(result!=null && result.next!=null){
            if (result.data==result.next.data){
                result.next=result.next.next;
                if (result.next!=null){
                    result.next.prev=result;
                }
            }else{
                result=result.next;
            }
        }
        
        return head;
    }
}