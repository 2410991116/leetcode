// User function Template for Java

class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        StringBuilder str=new StringBuilder();
        
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            
            if (i>=0){
                sum=sum+arr1[i];
                i--;
            }
            
            if (j>=0){
                sum=sum+arr2[j];
                j--;
            }
            
            str.append(sum%10);
            carry=sum/10;
        }
        
        return str.reverse().toString();
        
    }
}
