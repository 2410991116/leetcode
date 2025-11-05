class Solution {
    public int myAtoi(String s) {
        s=s.trim();

        if (s.length()==0){
            return 0;
        }

        int sign=1;
        int index=0;
        long res=0;

        if (s.charAt(index)=='+' || s.charAt(index)=='-'){
            if (s.charAt(index)=='-'){
                sign=-1;
            }else{
                sign=1;
            }
            index++;
        }

        while (index<s.length() && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            res=res*10+digit;

            if ((sign*res)>Integer.MAX_VALUE ){
                return Integer.MAX_VALUE;
            }
            if ((sign*res)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            index++;
        }


        return (int)(sign*res);


    }
}