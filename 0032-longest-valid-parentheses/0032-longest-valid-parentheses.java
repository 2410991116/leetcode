class Solution {
    public int longestValidParentheses(String s) {
        int left=0;
        int right=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='('){
                left++;
            }else{
                right++;
            }

            if (left==right){
                max=Math.max(max,left+right);
            }else if (right>left){
                left=right=0;
            }
        }

        left=right=0;
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);

            if (ch=='('){
                left++;
            }else{
                right++;
            }

            if (left==right){
                max=Math.max(max,left+right);
            }else if (left>right){
                left=right=0;
            }
        }

        return max;
    }
}