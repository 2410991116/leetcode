class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends==1){
            return word;
        }
        
        String ans="";

        int longest=word.length()-(numFriends-1);

        for (int i=0;i<word.length();i++){
            int cantakelength=Math.min(longest,word.length()-i);

            String str=word.substring(i,i+cantakelength);
            if (ans.compareTo(str)<0){
                ans=str;
            }
        }

        return ans;
    }
}