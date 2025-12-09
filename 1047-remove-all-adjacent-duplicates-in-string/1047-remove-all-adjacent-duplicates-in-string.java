class Solution {
    public String removeDuplicates(String s) {
        char[] arr=s.toCharArray();

        Stack<Character> st=new Stack<>();

        for (int i=0;i<arr.length;i++){
            if (st.size()==0 || arr[i]!=st.peek()){
                st.push(arr[i]);
            }else{
                st.pop();
            }
        }

        StringBuilder sb=new StringBuilder();

        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}