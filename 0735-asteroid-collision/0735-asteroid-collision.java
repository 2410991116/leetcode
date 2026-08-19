class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();

        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            boolean same=false;
            while (!st.isEmpty() && num<0 && st.peek()>0){  
                int top=st.peek();

                if (top < -num){
                    st.pop();
                }else if (top==-num){
                    st.pop();
                    same=true;
                    break;
                }else{
                    same=true;
                    break;
                }
            }
            if (!same){
                st.push(num);
            }
        }

        int[] ans=new int[st.size()];
        for (int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}