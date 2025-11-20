class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*(nums.length);

        int[] arr=new int[n];
        int k=0;
        for (int i=0;i<nums.length;i++){
            arr[k++]=nums[i];
        }

        for (int i=0;i<nums.length;i++){
            arr[k++]=nums[i];
        }

        return arr;
    }
}