class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,List<Character>> map=new HashMap<>();
        map.put(2,new ArrayList<>(Arrays.asList('a','b','c')));
        map.put(3,new ArrayList<>(Arrays.asList('d','e','f')));
        map.put(4,new ArrayList<>(Arrays.asList('g','h','i')));
        map.put(5,new ArrayList<>(Arrays.asList('j','k','l')));
        map.put(6,new ArrayList<>(Arrays.asList('o','n','m')));
        map.put(7,new ArrayList<>(Arrays.asList('p','q','r','s')));
        map.put(8,new ArrayList<>(Arrays.asList('v','u','t')));
        map.put(9,new ArrayList<>(Arrays.asList('w','x','y','z')));

        List<String> result=new ArrayList<>();
        result.add("");

        for (char d:digits.toCharArray()){
            List<String> temp=new ArrayList<>();
            for (String s:result){
                List<Character> l=map.get(d-'0');
                for (char ch:l){
                    temp.add(s+ch);
                }
            }
            result=temp;
        }

        return result;

    }
}