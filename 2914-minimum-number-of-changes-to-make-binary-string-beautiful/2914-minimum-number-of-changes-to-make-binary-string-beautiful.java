class Solution {
    public int minChanges(String s) {
        int count=0;
        char ch=s.charAt(0);
        int changes=0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==ch){
                count++;
                continue;
            }

            if (count%2==0){
                count=1;
            }else{
                changes++;
                count=0;
            }

            ch=s.charAt(i);
        }

        return changes;
    }
}