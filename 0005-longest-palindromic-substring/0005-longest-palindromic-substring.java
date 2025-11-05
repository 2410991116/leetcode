class Solution {
    public boolean ispalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public String longestPalindrome(String s) {
        String largest="";

        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);

                if (ispalin(sub)  &&  sub.length()>largest.length()){
                largest=sub;
            }
            }
        }

        return largest;
    }
}