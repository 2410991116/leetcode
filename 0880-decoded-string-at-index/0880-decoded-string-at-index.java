class Solution {
    public String decodeAtIndex(String s, int k) {
        int n=s.length();
        long size=0;

        for (char ch:s.toCharArray()){
            if (Character.isDigit(ch)){
                size*=(ch-'0');
            }else{
                size++;
            }
        }

        for (int i=n-1;i>=0;i--){
            k=(int)(k%size);
            if (k==0 && Character.isLetter(s.charAt(i))){
                String str="";
                str+=s.charAt(i);
                return str;
            }

            if (Character.isLetter(s.charAt(i))){
                size--;
            }else{
                size/=(s.charAt(i)-'0');
            }
        }

        return "";
    }
}