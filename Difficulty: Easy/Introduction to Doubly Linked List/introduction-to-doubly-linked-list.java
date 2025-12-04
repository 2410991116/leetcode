// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        if (arr==null || arr.length==0){
            return null;
        }
        Node result=new Node(arr[0]);
        Node temp=result;
        
        for (int i=1;i<arr.length;i++){
            Node curr=new Node(arr[i]);
            
            temp.next=curr;
            curr.prev=temp;
            
            temp=curr;
        }
        
        return result;
        
    }
}