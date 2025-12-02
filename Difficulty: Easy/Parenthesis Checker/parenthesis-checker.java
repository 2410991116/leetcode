class Solution {
    public boolean isBalanced(String s) {
        // code here
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        
        for (int i=0;i<arr.length;i++){
            if (arr[i]=='[' || arr[i]=='{' || arr[i]=='('){
                st.push(arr[i]);
            }else{
                if (st.isEmpty()){
                    return false;
                }
                
                char top=st.pop();
                
                if ((top=='[' && arr[i]!=']') ||
                    (top=='{' && arr[i]!='}') ||
                    (top=='(' && arr[i]!=')') ){
                        return false;
                    }
            }
        }
        
        return st.isEmpty();
    }
}
