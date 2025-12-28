class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];

        int k=0;
        for (int i=0;i<nums.length;i++){
            arr[k++]=nums[nums[i]];
        }

        return arr;
    }
}