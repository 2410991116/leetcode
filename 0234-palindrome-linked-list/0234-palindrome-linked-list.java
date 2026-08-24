
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while (curr!=null){
            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null){
            return true;
        }

        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode head2=slow.next;
        slow.next=null;

        head2=reverse(head2);

        ListNode i=head;
        ListNode j=head2;

        while (j != null) {
            if (i.val != j.val) {
                return false;
            }

            i = i.next;
            j = j.next;
        }

        return true;
    }
}