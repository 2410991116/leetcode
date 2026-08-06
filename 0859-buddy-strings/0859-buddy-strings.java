class Solution {
    public boolean check(String s){
        HashSet<Character> set=new HashSet<>();
        for (int i=0;i<s.length();i++){
            if (set.contains(s.charAt(i))){
                return true;
            }
            set.add(s.charAt(i));
        }

        return false;
    }
    public boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return check(s);
        }

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)!=goal.charAt(i)){
                arr.add(i);
            }
        }

        if (arr.size()!=2){
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        char temp = sb.charAt(arr.get(0));
        sb.setCharAt(arr.get(0), sb.charAt(arr.get(1)));
        sb.setCharAt(arr.get(1), temp);

        s = sb.toString();

        return s.equals(goal);
    }
}