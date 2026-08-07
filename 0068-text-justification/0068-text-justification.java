class Solution {
    public List<String> fullJustify(String[] words, int max) {
        List<String> arr=new ArrayList<>();

        int i=0;
        while (i<words.length){
            int lettercount=words[i].length();
            int j=i+1;

            while (j<words.length && lettercount+words[j].length()+(j-i)<=max){
                lettercount+=words[j].length();
                j++;
            }

            int gaps=j-i-1;

            StringBuilder sb=new StringBuilder();

            if (j==words.length || gaps==0){
                for (int k=i;k<j;k++){
                    sb.append(words[k]);
                    if (k<j-1){
                        sb.append(" ");
                    }
                }
                while (sb.length()<max){
                    sb.append(" ");
                }
            }else{
                int totalspace=max-lettercount;
                int eachspace=totalspace/gaps;
                int extraspace=totalspace%gaps;

                for (int k=i;k<j;k++){
                    sb.append(words[k]);
                    if (k<j-1){
                        for (int s=0;s<eachspace;s++){
                            sb.append(" ");
                        }
                        if (extraspace>0){
                            sb.append(" ");
                            extraspace--;
                        }
                    }
                }
            }

            arr.add(sb.toString());
            i=j;
        }

        return arr;
    }
}