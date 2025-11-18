class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> freq=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        int count=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                count++;
            }else{
                freq.add(count);
                arr.add(nums[i]);
                count=1;
            }
        }

        freq.add(count);
        arr.add(nums[nums.length-1]);

        int max=freq.get(0);
        int con=0;
        for (int i=0;i<freq.size();i++){
            if (freq.get(i)>max){
                max=freq.get(i);
            }
        }

        for (int i=0;i<freq.size();i++){
            if (freq.get(i)==max){
                con+=freq.get(i);
            }
        }

        return con;
    }
}