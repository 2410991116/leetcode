class Solution {
    public String intToRoman(int num) {
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb=new StringBuilder();
        while (num!=0){
            for (int i=0;i<13;i++){
                if (val[i]<=num){
                    sb.append(sym[i]);
                    num-=val[i];
                    break;
                }
            }
        }

        return sb.toString();
    }
}