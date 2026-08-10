class Solution {
    public void LPS(String word,int[] lps){
        lps[0]=0;
        int length=0;
        int i=1;

        while (i<word.length()){
            if (word.charAt(i)==word.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }else{
                if (length!=0){
                    length=lps[length-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    public int minimumTimeToInitialState(String word, int k) {
        int n=word.length();
        int[] lps=new int[n];
        LPS(word,lps);

        int suff_length=lps[n-1];

        while (suff_length>0 && (n-suff_length)%k!=0){
            suff_length=lps[suff_length-1];
        }

        if ((n-suff_length)%k==0){
            return (n-suff_length)/k;
        }

        return (int) Math.ceil((double)n/k);
    }
}