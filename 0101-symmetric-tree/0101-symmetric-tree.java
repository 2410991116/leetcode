class Solution {
    public boolean isSymmetric(TreeNode root) {
        return answer(root.left,root.right);
    }

    public boolean answer(TreeNode p,TreeNode q){
        if (p==null && q==null){
            return true;
        }

        if (p==null || q==null){
            return false;
        }

        if (p.val!=q.val){
            return false;
        }

        return answer(p.left,q.right) && answer(p.right,q.left);
    }
}