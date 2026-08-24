class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        
        ListNode answer=new ListNode(head.val);
        ListNode ans=answer;

        ListNode temp=head.next;
        int prev=head.val;
        while (temp!=null){
            if (temp.val!=prev){
                ans.next=new ListNode(temp.val);
                prev=temp.val;
                ans=ans.next;
            }
            temp=temp.next;
        }

        return answer;
    }
}