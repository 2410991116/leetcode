class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }

        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<TreeNode> qnode=new LinkedList<>();
        Queue<Integer> qpos=new LinkedList<>();

        qnode.add(root);
        qpos.add(0);
        while (!qnode.isEmpty()){
            TreeNode curr=qnode.remove();
            int pos=qpos.remove();

            map.put(pos,curr.val);

            if (curr.left!=null){
                qnode.add(curr.left);
                qpos.add(pos+1);
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