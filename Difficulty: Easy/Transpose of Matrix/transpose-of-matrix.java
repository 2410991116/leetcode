class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        for (int i=0;i<mat.length;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for (int j=0;j<mat.length;j++){
               row.add(mat[j][i]);
            }
            result.add(row);
        }
        
        return result;
    }
}