class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode fast=head;
        for (int i=1;i<k;i++){
            first=first.next;
            fast=fast.next;
        }

        ListNode sec=head;
        while (fast.next!=null){
            sec=sec.next;
            fast=fast.next;
        }

        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        
        return head;

    }
}