class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        int cols=arr[0].length-1;

        while (row<arr.length && cols>=0){
            if (arr[row][cols]==target){
                return true;
            }else if (arr[row][cols]<target){
                row++;
            }else{
                cols--;
            }
        }

        return false;
    }
}