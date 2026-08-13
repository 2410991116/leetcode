class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map=new HashMap<>();

        for (int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for (int j=i;j<s.length();j++){
                if (s.charAt(j) != s.charAt(i)) {
                    break;
                }
                sb.append(s.charAt(j));
                String str=sb.toString();
                if (map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }else{
                    map.put(str,1);
                }
            }
        }

        int ans=-1;
        for (String str:map.keySet()){
            if (map.get(str)>=3){
                ans=Math.max(ans,str.length());
            }
        }

        return ans;
    }
}