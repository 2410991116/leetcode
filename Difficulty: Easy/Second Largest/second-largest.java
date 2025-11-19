class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=0;
        int sec=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[large]){
                sec=large;
                large=i;
            }else if(arr[i]!=arr[large]){
                if (sec==-1 || arr[i]>arr[sec]){
                    sec=i;
                }
            }
        }
        
        return arr[sec];
    }
}