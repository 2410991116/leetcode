class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> arr=new ArrayList<>();
        int i=s.length-1;
        while (i>=0){
            arr.add(s[i]);
            i--;
        }

        int j=0;
        while (j<s.length){
            s[j]=arr.get(j);
            j++;
        }
    }
}