class Solution {
    int search(int[] arr, int key) {
        // code here
        int i=0;
        while (i<arr.length){
            if (arr[i]==key){
                return i;
            }
            i++;
        }
        
        return -1;
    }
}