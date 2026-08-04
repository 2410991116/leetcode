class Solution {
    public boolean solve(String s,int i,int j,boolean[][] dp){
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        int max=0;
        int start=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (solve(s,i,j,dp)){
                    if ((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                    }
                }
            }
        }

        return s.substring(start,start+max);
    }
}