class Solution {
    public int minDeletionSize(String[] str) {
        int count=0;
        for (int i=0;i<str[0].length();i++){
            for (int j=1;j<str.length;j++){
                if (str[j].charAt(i)<str[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}