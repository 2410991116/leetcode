class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
        int i=0;
        while (i<arr.length){
            if (arr[i]>arr[max]){
                max=i;
                i++;
            }else{
                i++;
            }
        }

        return max;
    }
}