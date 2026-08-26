class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        does(root,arr);
        return arr;
    }
    
    public void does(Node root,ArrayList<Integer> arr){
        if (root==null){
            return;
        }
        
        arr.add(root.data);
        does(root.left,arr);
        does(root.right,arr);
    }
}