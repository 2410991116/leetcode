class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);

        for (ListNode node:lists){
            if (node!=null){
                pq.add(node);
                node=node.next;
            }
        }

        ListNode answer=new ListNode(0);
        ListNode ans=answer;

        while (!pq.isEmpty()){
            ListNode node=pq.remove();

            ans.next=node;
            ans=ans.next;

            if (node.next!=null){
                pq.add(node.next);
            }
        }

        return answer.next;
    }


}