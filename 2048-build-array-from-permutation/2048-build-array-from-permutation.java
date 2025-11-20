class Solution {
    public int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];

        int k=0;
        for (int i=0;i<nums.length;i++){
            result[k++]=nums[nums[i]];
        }

        return result;
    }
}