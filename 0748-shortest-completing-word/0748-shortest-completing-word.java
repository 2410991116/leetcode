class Solution {
    public boolean isSubset(int[] temp,int[] freq){
        for (int i=0;i<26;i++){
            if (temp[i]<freq[i]){
                return false;
            }
        }
        return true;
    }
    public String shortestCompletingWord(String str, String[] words) {
        int[] freq=new int[26];
        for (char ch:str.toCharArray()){
            ch=Character.toLowerCase(ch);
            if (Character.isLetter(ch)){
                freq[ch-'a']++;
            }
        }

        String ans="";
        for (String s:words){
            int[] temp=new int[26];
            for (char ch:s.toCharArray()){
                ch=Character.toLowerCase(ch);
                temp[ch-'a']++;
            }

            if (isSubset(temp, freq)) {

                if (ans.equals("") || s.length() < ans.length()) {
                    ans = s;
                }
            }
        }        

        return ans;
    }
}