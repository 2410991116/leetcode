/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        
        Node t1=head1;
        Node t2=head2;
        
        while (t1!=null){
            arr1.add(t1.data);
            t1=t1.next;
        }
        
        while(t2!=null){
            arr2.add(t2.data);
            t2=t2.next;
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        
        int i=arr1.size()-1;
        int j=arr2.size()-1;
        int carry=0;
        
        while (i>=0 || j>=0 || carry>0){
            int sum=carry;
            
            if (i>=0){
                sum=sum+arr1.get(i);
                i--;
            }
            
            if (j>=0){
                sum=sum+arr2.get(j);
                j--;
            }
            
            res.add(sum%10);
            carry=sum/10;
        }
        
        Collections.reverse(res);
        
        Node result=new Node(res.get(0));
        Node dumy=result;
        
        for (int k=1;k<res.size();k++){
            dumy.next=new Node(res.get(k));
            dumy=dumy.next;
        }
        
         while (result != null && result.data == 0 && result.next != null) {
            result = result.next;
        }

        
        return result;
        
    }
}