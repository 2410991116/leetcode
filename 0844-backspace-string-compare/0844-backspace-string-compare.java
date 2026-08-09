class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='#'){
                if (sb1.length()==0){
                    continue;
                }else{
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }else{
                sb1.append(ch);
            }
        }

        StringBuilder sb2=new StringBuilder();
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (ch=='#'){
                if (sb2.length()==0){
                    continue;
                }else{
                    sb2.deleteCharAt(sb2.length()-1);
                }
            }else{
                sb2.append(ch);
            }
        }

        return sb1.toString().equals(sb2.toString());        
    }
}