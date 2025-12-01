/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if (head==null){
            return false;
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        int i=0;
        int j=arr.size()-1;
        
        while (i<j){
            if (!arr.get(i).equals(arr.get(j))){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}