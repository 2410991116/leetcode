class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        
        int size=q.size();
        
        if (k==0 || k>size ){
            return q;
        }
        
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=q.remove();
        }
        
        ArrayList<Integer> nums=new ArrayList<>();
        
        for (int i=k-1;i>=0;i--){
            nums.add(arr[i]);
        }
        
        for (int i=k;i<arr.length;i++){
            nums.add(arr[i]);
        }
        
        
        for (int i=0;i<nums.size();i++){
            q.add(nums.get(i));
        }
        
        return q;
    }
}