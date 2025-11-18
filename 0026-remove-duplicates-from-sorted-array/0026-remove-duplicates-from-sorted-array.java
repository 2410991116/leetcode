class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);

        int[] arr=new int[nums.length];

        arr[0]=nums[0];
        int j=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                continue;
            }

            arr[j++]=nums[i];
        }

        for (int i=0;i<j;i++){
            nums[i]=arr[i];
        }

        return j;
    }
}