class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr=new ArrayList<>();

        Arrays.sort(nums);
        int start=nums[0],end=nums[nums.length-1];
        int k=0;

        for (int i=start;i<=end;i++){
            if (nums[k] == i){
                k++;
            }else{
                arr.add(i);
            }
        }

        return arr;
    }
}