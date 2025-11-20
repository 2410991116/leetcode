class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        while (i<nums.length){
            if (nums[i]==target){
                return i;
            }
            i++;
        }

        int k=0;
        int index=nums.length;
        while(k<nums.length){
            if (nums[k]>target){
                index=k;
                break;
            }
            k++;
        }

        return index;
    }
}