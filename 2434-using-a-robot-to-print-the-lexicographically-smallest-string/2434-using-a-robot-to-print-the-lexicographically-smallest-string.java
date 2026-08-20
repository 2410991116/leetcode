class Solution {
    public String robotWithString(String s) {
        char[] arr=new char[s.length()];
        arr[s.length()-1]=s.charAt(s.length()-1);

        for (int i=s.length()-2;i>=0;i--){
            if (s.charAt(i)<arr[i+1]){
                arr[i]=s.charAt(i);
            }else{
                arr[i]=arr[i+1];
            }
        }

        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<s.length();i++){
            st.push(s.charAt(i));

            while (!st.isEmpty() && (i==s.length()-1 || st.peek()<=arr[i+1])){
                sb.append(st.pop());
            }
        }

        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}