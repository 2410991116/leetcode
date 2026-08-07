class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> idx=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            idx.put(ch,i);
        }

        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if (visited[ch-'a']){
                continue;
            }

            while (!st.isEmpty() && st.peek()>ch && idx.get(st.peek())>i){
                visited[st.pop()-'a']=false;
            }

            st.push(ch);
            visited[ch-'a']=true;
        }

        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();

    }
}