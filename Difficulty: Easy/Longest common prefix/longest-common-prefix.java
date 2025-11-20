// User function Template for Java

class Solution {
    public int longestCommonPrefix(String s1, String s2) {
        // code here
        for (int i=s1.length();i>0;i--){
            String str=s1.substring(0,i);
            if (s2.contains(str)){
                return i;
            }
        }
        
        return 0;
    }
}