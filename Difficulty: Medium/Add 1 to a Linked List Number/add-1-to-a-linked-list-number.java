/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        if (head==null){
            return head;
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        int carry=1;
        for (int i=arr.size()-1;i>=0;i--){
            int sum=arr.get(i)+carry;
            arr.set(i,sum%10);
            carry=sum/10;
        }
        
        if (carry==1){
            arr.add(0,1);
        }
        
        Node res=new Node(arr.get(0));
        Node result=res;
        
        for (int i=1;i<arr.size();i++){
            result.next=new Node(arr.get(i));
            result=result.next;
        }
        
        return res;
        
        
    }
}