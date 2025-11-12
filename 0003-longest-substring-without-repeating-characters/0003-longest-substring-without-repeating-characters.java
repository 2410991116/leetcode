class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> arr=new ArrayList<>();

        int start=0,end=0;
        int maxi=0;

        while(end<s.length()){
            if (!arr.contains(s.charAt(end))){
                arr.add(s.charAt(end));
                end++;
                maxi=Math.max(maxi,arr.size());
            }else{
                arr.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return maxi;
    }
}