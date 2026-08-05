class Solution {
    public boolean vowel(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()/2;

        int count1=0,count2=0;
        while (i<s.length()/2 && j<s.length()){
            if (vowel(s.charAt(i))){
                count1++;
            }

            if (vowel(s.charAt(j))){
                count2++;
            }

            i++;
            j++;
        }

        return count1==count2;
    }
}