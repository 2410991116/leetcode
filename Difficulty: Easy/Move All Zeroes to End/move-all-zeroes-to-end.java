class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int[] nums=new int[arr.length];
        
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                nums[k++]=arr[i];
            }
        }
        
        while(k!=arr.length){
            nums[k++]=0;
        }
        
        for (int i=0;i<k;i++){
            arr[i]=nums[i];
        }
    }
}