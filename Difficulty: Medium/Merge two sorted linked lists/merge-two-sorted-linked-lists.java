/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dumy=head1;
        ArrayList<Integer> arr1=new ArrayList<>();
        while(dumy!=null){
            arr1.add(dumy.data);
            dumy=dumy.next;
        }
        
        Node dummy=head2;
        ArrayList<Integer> arr2=new ArrayList<>();
        while(dummy!=null){
            arr2.add(dummy.data);
            dummy=dummy.next;
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=0;i<arr1.size();i++){
            res.add(arr1.get(i));
        }
        for (int i=0;i<arr2.size();i++){
            res.add(arr2.get(i));
        }
        
        Collections.sort(res);
        
        Node result=new Node(res.get(0));
        Node temp=result;
        
        for (int i=1;i<res.size();i++){
            temp.next=new Node(res.get(i));
            temp=temp.next;
        }
        
        return result;
        
        
    }
}