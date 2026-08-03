class Solution {
    public String reverseStr(String str, int k) {
        StringBuilder s=new StringBuilder(str);
        for (int i=0;i<s.length();i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,s.length()-1);
            while (left<right){
                char temp=s.charAt(left);
                s.setCharAt(left,s.charAt(right));
                s.setCharAt(right,temp);

                left++;
                right--;
            }
        }

        return s.toString();
    }
}