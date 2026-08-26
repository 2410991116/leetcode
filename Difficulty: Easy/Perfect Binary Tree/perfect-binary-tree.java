class Solution {
    boolean isPerfect(Node root) {
        int lev=level(root);
        int si=size(root);
        
        if (Math.pow(2,lev)-1 == si){
            return true;
        }else{
            return false;
        }
    }
    
    int level(Node root){
        if (root==null){
            return 0;
        }
        
        return 1+ Math.max(level(root.left),level(root.right));
    }
    
    int size(Node root){
        if (root==null){
            return 0;
        }
        
        return 1 + size(root.left) + size(root.right);
    }
};