class Solution {
    public long check(String str,String suff,int limit){
        if (str.length()<suff.length()){
            return 0;
        }

        long count=0;
        int remLen=str.length()-suff.length();
        for (int i=0;i<remLen;i++){
            int digit=str.charAt(i)-'0';

            if (digit<=limit){
                count+=(long)digit*(long)Math.pow(limit+1,remLen-i-1);
            }else{
                count+=(long)Math.pow(limit+1,remLen-i);
                return count;
            }
        }

        String candidate = str.substring(0, remLen) + suff;
        if (candidate.compareTo(str) <= 0){
            count++;
        }

        return count;
    }

    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String str1=Long.toString(start-1);
        String str2=Long.toString(finish);

        return check(str2,s,limit)-check(str1,s,limit);
    }
}