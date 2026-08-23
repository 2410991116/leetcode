class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null){
            return head;
        }
        
        int size=0;
        ListNode temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }

        k=k%size;
        if (k==0){
            return head;
        }

        k=size-k;

        temp=head;
        for (int i=0;i<k-1;i++){
            temp=temp.next;
        }

        ListNode newhead=temp.next;

        ListNode tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }

        tail.next=head;
        temp.next=null;

        return newhead;
    }
}