class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return find(text1,text2,0,0,dp);
    }

    public int find(String text1,String text2,int i,int j,int[][] dp){
        if (i>=text1.length() || j>=text2.length()){
            return 0;
        }

        if (dp[i][j]!=-1){
            return dp[i][j];
        }

        if (text1.charAt(i)==text2.charAt(j)){
            return dp[i][j] = 1+find(text1,text2,i+1,j+1,dp);
        }else{
            return dp[i][j] = Math.max(find(text1,text2,i+1,j,dp),find(text1,text2,i,j+1,dp));
        }
    }
}