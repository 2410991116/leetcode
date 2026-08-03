class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while (left<right){
            if (s.charAt(left)==s.charAt(right)){
                right--;
                left++;
            }else{
                return isPalidrome(s,left+1,right) || isPalidrome(s,left,right-1);
            }
        }

        return true;
    }

    public boolean isPalidrome(String s,int left,int right){
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}