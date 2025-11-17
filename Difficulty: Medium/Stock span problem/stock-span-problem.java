class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();   // store indexes

        // First day span is always 1
        st.push(0);
        span.add(1);

        for (int i = 1; i < arr.length; i++) {

            // Remove all smaller prices
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // If stack empty => all previous are smaller
            if (st.isEmpty()) {
                span.add(i + 1);
            } else {
                // span = distance to previous greater price
                span.add(i - st.peek());
            }

            // Add current day index
            st.push(i);
        }

        return span;
    }
}