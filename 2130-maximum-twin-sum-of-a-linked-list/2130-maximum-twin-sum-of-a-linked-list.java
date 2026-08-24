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
    public int pairSum(ListNode head) {
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

        int max=-1;
        while (j!=null){
            int sum=i.val+j.val;
            max=Math.max(max,sum);

            i=i.next;
            j=j.next;
        }

        return max;
    }
}