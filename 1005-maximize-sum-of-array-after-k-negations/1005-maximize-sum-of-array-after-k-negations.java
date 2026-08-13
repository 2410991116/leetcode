class Solution {
    public int totalsum(int[] nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                nums[i]=-nums[i];
                count++;

                if (count==k){
                    break;
                }
            }else{
                break;
            }
        }

        if (count<k){
            if ((k-count)%2==0){
                return totalsum(nums);
            }

            int min=Integer.MAX_VALUE;
            int idx=-1;
            for (int i=0;i<nums.length;i++){
                if (nums[i]<min){
                    idx=i;
                    min=nums[i];
                }
            }

            nums[idx]=-nums[idx];
            return totalsum(nums);
        }

        return totalsum(nums);
    }
}