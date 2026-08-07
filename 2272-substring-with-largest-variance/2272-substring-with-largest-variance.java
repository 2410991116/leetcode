class Solution {
    public int largestVariance(String s) {
        HashSet<Character> set=new HashSet<>();
        for (int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        int result=0;
        for (char first='a';first<='z';first++){
            for (char second='a';second<='z';second++){
                if (!set.contains(first) || !set.contains(second)){
                    continue;
                }

                int fcount=0;
                int scount=0;
                boolean sfound=false;
                for (char ch:s.toCharArray()){
                    if (ch==first){
                        fcount++;
                    }else if (ch==second){
                        scount++;
                    }

                    if (scount>0){
                        result=Math.max(result,fcount-scount);
                    }else if (sfound==true){
                        result=Math.max(result,fcount-1);
                    }

                    if (scount>fcount){
                        fcount=0;
                        scount=0;
                        sfound=true;
                    }
                }
            }
        }

        return result;
    }
}