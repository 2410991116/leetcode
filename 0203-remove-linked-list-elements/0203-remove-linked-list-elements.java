/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();

        ListNode dummy=head;
        while(dummy!=null){
            arr.add(dummy.val);
            dummy=dummy.next;
        }

        ArrayList<Integer> res=new ArrayList<>();

        for (int i=0;i<arr.size();i++){
            if (arr.get(i)==val){
                continue;
            }else{
                res.add(arr.get(i));
            }
        }

        if (res.size()==0){
            return null;
        }

        ListNode result=new  ListNode(res.get(0));
        ListNode temp=result;

        for (int i=1;i<res.size();i++){
            temp.next=new ListNode(res.get(i));
            temp=temp.next;
        }

        return result;
    }
}