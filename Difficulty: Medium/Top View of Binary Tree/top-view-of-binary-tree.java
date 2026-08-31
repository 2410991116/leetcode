class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Node> qnode=new LinkedList<>();
        Queue<Integer> qpos=new LinkedList<>();
        qnode.add(root);
        qpos.add(0);
        while (!qnode.isEmpty()){
            Node curr=qnode.remove();
            int pos=qpos.remove();
            
            if (!map.containsKey(pos)){
                map.put(pos,curr.data);
            }
            
            if (curr.left!=null){
                qnode.add(curr.left);
                qpos.add(pos-1);
            }
            
            if (curr.right!=null){
                qnode.add(curr.right);
                qpos.add(pos+1);
            }
        }
        
        for (int val:map.values()){
            arr.add(val);
        }
        
        return arr;
    }
}