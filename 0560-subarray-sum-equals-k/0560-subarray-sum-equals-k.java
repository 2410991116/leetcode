class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int count=0;
        int right=0;
        int sum=0;

        while (right<nums.length){
            sum+=nums[right];
            int rem=sum-k;

            if (map.containsKey(rem)){
                count+=map.get(rem);
            }

            if (map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }

            right++;
        }

        return count;
    }
}