class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        answer(root,arr);
        return arr;
    }

    public void answer(TreeNode root,List<Integer> arr){
        if (root==null){
            return ;
        }

        answer(root.left,arr);
        arr.add(root.val);
        answer(root.right,arr);
    }
}