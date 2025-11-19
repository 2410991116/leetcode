class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int i=0,j=0;
        while (i<a.length && j<b.length){
            if (a[i]==b[j]){
                count++;
                i++;
                j++;
            }else if (a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        
        return count;
    }
}