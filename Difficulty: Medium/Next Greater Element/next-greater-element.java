class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
    ArrayList<Integer> result = new ArrayList<>(n);
    
    // Fill result initially with -1
    for (int i = 0; i < n; i++) {
        result.add(-1);
    }

    Stack<Integer> st = new Stack<>(); // stores indexes

    for (int i = 0; i < n; i++) {

        // While current element is greater than element at index on top of stack
        while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
            int idx = st.pop();
            result.set(idx, arr[i]);
        }

        st.push(i);
    }

    return result;
    }
}