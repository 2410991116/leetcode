class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch=='[' || ch=='{' || ch=='('){
                str.push(ch);
            }else{
                if (str.isEmpty()){
                    return false;
                }

                int top=str.pop();

                if ((ch==']' && top!='[') ||
                    (ch=='}' && top!='{') ||
                    (ch==')' && top!='(')){
                        return false;
                    }
            }
        }
        return str.isEmpty();

    }
}