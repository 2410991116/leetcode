class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int[] nums=new int[arr.length];
        
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            
            if (st.isEmpty()){
                nums[i]=-1;
            }else{
                nums[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return nums;
    }
}
