class Solution {
    static String revStr(String s) {
        // code here
        char[] str=s.toCharArray();
        char[] res=new char[s.length()];
        
        int k=0;
        for (int i=str.length-1;i>=0;i--){
            res[k++]=str[i];
        }
        
        return new String(res);
        
        
    }
}