class Solution {
    public String reverse(String S) {
        Stack<Character> st=new Stack<>();
        
        for (char ch: S.toCharArray()){
            st.push(ch);
        }
        
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        
        
        return sb.toString();
    }
}