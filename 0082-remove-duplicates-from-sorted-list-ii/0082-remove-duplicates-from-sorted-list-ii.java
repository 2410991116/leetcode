class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode answer=new ListNode(0);
        ListNode ans=answer;
        ListNode i=head;

        while (i!=null){
            if (i.next==null || i.val!=i.next.val){
                ans.next=i;
                ans=ans.next;
                i=i.next;
            }else{
                ListNode j=i.next;
                while (j!=null && j.val==i.val){
                    j=j.next;
                }
                i=j;
            }
        }

        ans.next=i;
        return answer.next;
    }
}