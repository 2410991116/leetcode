class Solution {
    public boolean sorted(String s){
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)<s.charAt(i-1)){
                return false;
            }
        }

        return true;
    }
    public int minDeletionSize(String[] str) {
        ArrayList<String> arr=new ArrayList<>();
        for (int i=0;i<str[0].length();i++){
            StringBuilder sb=new StringBuilder();
            for (int j=0;j<str.length;j++){
                sb.append(str[j].charAt(i));
            }
            arr.add(sb.toString());
        }

        int count=0;
        for (int i=0;i<arr.size();i++){
            if (!sorted(arr.get(i))){
                count++;
            }
        }

        return count;
    }
}