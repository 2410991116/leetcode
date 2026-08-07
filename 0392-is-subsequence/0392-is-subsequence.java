class Solution {
    public boolean isSubsequence(String s, String t) {
        HashMap<Character,List<Integer>> map=new HashMap<>();
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (map.containsKey(ch)){
                List<Integer> l=map.get(ch);
                l.add(i);
                map.put(ch,l);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(ch,l);
            }
        }

        int prev=-1;
        for (char ch:s.toCharArray()){
            if (!map.containsKey(ch)){
                return false;
            }

            List<Integer> l=map.get(ch);
            int idx=upperBound(l,prev);

            if (idx==l.size()){
                return false;
            }

            prev=l.get(idx);
        }

        return true;
    }

    public int upperBound(List<Integer> l,int prev){
        int low = 0;
        int high = l.size();

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (l.get(mid) <= prev)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}