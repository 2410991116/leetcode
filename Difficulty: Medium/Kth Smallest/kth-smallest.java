class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);       // sort the array
        return arr[k - 1];      
    }
}
