// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
        ArrayList<Integer> nums=new ArrayList<>();
        
        int first=-1,last=-1;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                if (first==-1){
                    first=i;
                }
                last=i;
                count=1;
            }
        }
        
        if (count==0){
            nums.add(-1);
        }else{
            nums.add(first);
            nums.add(last);
        }
        
        return nums;
    }
}
