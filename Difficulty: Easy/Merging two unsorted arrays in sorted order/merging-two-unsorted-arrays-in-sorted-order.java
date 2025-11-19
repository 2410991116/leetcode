class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        // code here
        int k=0;
        for (int i=0;i<arr1.length;i++){
            res[k++]=arr1[i];
        }
        
        for (int i=0;i<arr2.length;i++){
            res[k++]=arr2[i];
        }
        
        Arrays.sort(res);
    }
}