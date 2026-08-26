class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr=q.remove();
            arr.add(curr.data);
            
            if (curr.left!=null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
        }
        
        return arr;
    }
}