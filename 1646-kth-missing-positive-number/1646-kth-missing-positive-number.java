class Solution {
    public int findKthPositive(int[] arr, int k) {
        int need=1;
        int i=0;

        while(k>0){
            if (i<arr.length && arr[i]==need){
                i++;
            }else{
                k--;
                if (k==0){
                    return need;
                }
            }
            need++;
        }

        return -1;
    }
}