class Solution {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }

        String say=countAndSay(n-1);

        StringBuilder ans=new StringBuilder();
        for (int i=0;i<say.length();i++){
            char curr=say.charAt(i);
            int count=0;

            while(i<say.length() && say.charAt(i)==curr){
                count++;
                i++;
            }

            ans.append(count).append(curr);
            i--;
        }

        return ans.toString();
    }
}