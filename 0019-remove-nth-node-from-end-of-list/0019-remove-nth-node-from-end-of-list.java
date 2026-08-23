class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for (int i=0;i<n;i++){
            if (fast==null){
                return null;
            }

            fast=fast.next;
        }

        ListNode prev=null;
        while(fast!=null){
            prev=slow;
            fast=fast.next;
            slow=slow.next;
        }

        if (prev==null){
            return head.next;
        }

        prev.next=slow.next;

        return head;
    }
}