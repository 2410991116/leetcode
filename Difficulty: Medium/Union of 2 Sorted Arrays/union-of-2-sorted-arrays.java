class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int k=0;
        
        for (int i=0;i<a.length;i++){
            arr.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            arr.add(b[i]);
        }
        
        Collections.sort(arr);
        
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr.get(0));
        for (int i=1;i<arr.size();i++){
            if (arr.get(i).equals(arr.get(i-1))){
                continue;
            }else{
                result.add(arr.get(i));
            }
        }
        
        return result;
    }
}
