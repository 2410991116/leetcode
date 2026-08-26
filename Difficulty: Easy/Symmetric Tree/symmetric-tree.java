class Solution {
    public boolean isSymmetric(Node root) {
        return check(root.left,root.right);
    }
    
    public boolean check(Node p,Node q){
        if (p==null && q==null){
            return true;
        }
        
        if (p==null || q==null){
            return false;
        }
        
        if (p.data!=q.data){
            return false;
        }
        
        return check(p.left,q.right) && check(p.right,q.left);
    }
}