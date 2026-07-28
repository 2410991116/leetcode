class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        for (int i=0;i<s.length();i++){
            char chs=s.charAt(i);
            char cht=t.charAt(i);

            if (map.containsKey(chs)){
                if (map.get(chs)!=cht){
                    return false;
                }
            }else{
                map.put(chs,cht);
            }

            if (map2.containsKey(cht)){
                if (map2.get(cht)!=chs){
                    return false;
                }
            }else{
                map2.put(cht,chs);
            }
        }
        
        return true;
    }
}