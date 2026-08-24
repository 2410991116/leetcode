class Solution {
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode head2=slow.next;
        slow.next=null;

        head=sortList(head);
        head2=sortList(head2);

        return merge(head,head2);
    }

    public ListNode merge(ListNode head,ListNode head2){
        ListNode answer=new ListNode(0);
        ListNode ans=answer;

        ListNode i=head;
        ListNode j=head2;

        while (i!=null && j!=null){
            if (i.val<j.val){
                ans.next=i;
                i=i.next;
                ans=ans.next;
            }else{
                ans.next=j;
                j=j.next;
                ans=ans.next;
            }
        }

        while (i!=null){
            ans.next=i;
            i=i.next;
            ans=ans.next;
        }

        while (j!=null){
            ans.next=j;
            j=j.next;
            ans=ans.next;
        }


        return answer.next;
    }
}