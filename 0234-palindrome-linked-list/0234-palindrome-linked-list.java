
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();

        while (head!=null){
            list.add(head.val);
            head=head.next;
        }

        int start=0,end=list.size()-1;
        while(start<end){
            if (list.get(start) != list.get(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
