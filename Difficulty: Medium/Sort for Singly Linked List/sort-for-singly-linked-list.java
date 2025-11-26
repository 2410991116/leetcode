// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head_ref) {
        // code here
        if (head_ref==null){
            return head_ref;
        }
        
        List<Integer> arr=new ArrayList<>();
        
        Node dummy=head_ref;
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        Collections.sort(arr);
        
        Node result=new Node(arr.get(0));
        
        Node current=result;
        
        for (int i=1;i<arr.size();i++){
            current.next = new Node(arr.get(i));
            current=current.next;
        }
        
        return result;
    }
}