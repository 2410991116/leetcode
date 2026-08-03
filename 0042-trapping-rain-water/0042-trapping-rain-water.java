class Solution {
    public int trap(int[] arr) {
        int sum=0;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;

        int left=0;
        int right=arr.length-1;

        while (left<right){
            lmax=Math.max(lmax,arr[left]);
            rmax=Math.max(rmax,arr[right]);

            if (lmax<rmax){
                sum+=lmax-arr[left];
                left++;
            }else{
                sum+=rmax-arr[right];
                right--;
            }           
        }

        return sum;
    }
}