class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<=0){
                continue;
            }else{
                arr[j++]=nums[i];
            }
        }

        Arrays.sort(arr,0,j);

        int ans=1;
        for (int i=0;i<j;i++){
            if (i>0 && arr[i]==arr[i-1]){
                continue;
            }
            if (arr[i]!=ans){
                return ans;
            }
            ans++;
        }
        return ans;
    }
}