class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> nums=new ArrayList<>();
        
        Stack<Integer> st=new Stack<>();
        
        for (int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            
            if (st.isEmpty()){
                nums.add(-1);
            }else{
                nums.add(st.peek());
            }
            
            st.push(arr[i]);
        }
        
        Collections.reverse(nums);
        
        return nums;
    }
}