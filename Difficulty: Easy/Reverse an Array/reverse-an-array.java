class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int[] nums=new int[arr.length];
        
        int k=0;
        for (int i=arr.length-1;i>=0;i--){
            nums[k++]=arr[i];
        }
        
        for (int i=0;i<k;i++){
            arr[i]=nums[i];
        }
        
    }
}