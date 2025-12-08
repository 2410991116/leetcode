class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> nums=new ArrayList<>();
        
        Stack<Integer> st=new Stack<>();
        
        for (int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            
            if (st.isEmpty()){
                nums.add(i+1);
            }else{
                nums.add(i-st.peek());
            }
            
            st.push(i);
        }
        
        return nums;
    }
}