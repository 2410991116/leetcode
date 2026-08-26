class Solution {
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        check(root,arr,l);
        return arr;
    }
    
    public void check(Node root,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> l){
        if (root==null){
            return;
        }
        
        if (root.left==null && root.right==null){
            l.add(root.data);
            arr.add(new ArrayList<>(l));
            l.remove(l.size()-1);
            return;
        }
        
        l.add(root.data);
        check(root.left,arr,l);
        check(root.right,arr,l);
        l.remove(l.size()-1);
    }
}