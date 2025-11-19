class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];

        int count=0,k=0;
        for (int i=0;i<nums.length;i++){
            count+=nums[i];
            arr[k++]=count;
        }

        return arr;
    }
}