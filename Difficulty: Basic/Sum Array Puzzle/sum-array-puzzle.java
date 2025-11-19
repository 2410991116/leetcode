class Solution {
    public void sumArray(List<Integer> arr) {
        // Your Code goes here
        int sum = 0;

        // Find total sum
        for (int num : arr) {
            sum += num;
        }

        // Modify array in-place
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, sum - arr.get(i));
        }
    }
}