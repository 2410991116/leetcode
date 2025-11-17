class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        List<Integer> arr=new ArrayList<>();
        while (!st.isEmpty()){
            arr.add(st.pop());
        }
        
        Collections.sort(arr);
        
        for (int i=0;i<arr.size();i++){
            st.push(arr.get(i));
        }
    }
}