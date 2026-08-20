class Solution {
    public int maxDepth(String s) {
        int open=0,close=0;

        int depth=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                open++;
                depth=Math.max(depth,open);
            }else if (s.charAt(i)==')'){
                if (open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }

        return depth;
    }
}