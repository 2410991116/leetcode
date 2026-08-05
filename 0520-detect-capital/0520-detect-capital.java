class Solution {
    public boolean detectCapitalUse(String word) {
        int up=0;
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if (Character.isUpperCase(ch)){
                up++;
            }
        }

        if (up==0){
            return true;
        }else if (up==1){
            if (Character.isUpperCase(word.charAt(0))){
                return true;
            }else{
                return false;
            }
        }else if (up==word.length()){
            return true;
        }else{
            return false;
        }
    }
}