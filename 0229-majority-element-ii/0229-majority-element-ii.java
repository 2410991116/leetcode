class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> freq=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        int count=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                count++;
            }else{
                freq.add(count);
                arr.add(nums[i-1]);
                count=1;
            }
        }

        freq.add(count);
        arr.add(nums[nums.length - 1]);

        int limit = nums.length / 3;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < freq.size(); i++) {
            if (freq.get(i) > limit) {
                result.add(arr.get(i));
            }
        }
        
        return result;
    }
}