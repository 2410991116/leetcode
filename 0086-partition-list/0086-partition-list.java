class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smaller=new ListNode(0);
        ListNode small=smaller;

        ListNode larger=new ListNode(0);
        ListNode large=larger;

        ListNode temp=head;

        while (temp!=null){
            if (temp.val < x){
                small.next=temp;
                small=small.next;
            }else{
                large.next=temp;
                large=large.next;
            }
            temp=temp.next;
        }

        larger=larger.next;
        large.next=null;
        small.next=larger;

        return smaller.next;       

    }
}