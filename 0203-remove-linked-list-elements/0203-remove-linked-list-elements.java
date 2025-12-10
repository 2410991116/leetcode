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
        while (dummy!=null){
            arr.add(dummy.val);
            dummy=dummy.next;
        }

        ArrayList<Integer> nums=new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)==val){
                continue;
            }else{
                nums.add(arr.get(i));
            }
        }

        if (nums.size()==0){
            return null;
        }

        ListNode result=new ListNode(nums.get(0));
        ListNode res=result;

        for (int i=1;i<nums.size();i++){
            res.next=new ListNode(nums.get(i));
            res=res.next;
        }

        return result;
    }
}