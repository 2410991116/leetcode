class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node dummy=head;
        
        while (dummy!=null){
            arr.add(dummy.data);
            dummy=dummy.next;
        }
        
        return arr;
    }
}