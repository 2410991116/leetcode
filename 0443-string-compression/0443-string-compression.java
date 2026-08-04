class Solution {
    public int compress(char[] arr) {
        int left=0;
        int right=0;

        while (right<arr.length){
            char curr=arr[right];
            int count=0;

            while (right<arr.length && arr[right]==curr){
                count++;
                right++;
            }

            arr[left++]=curr;

            if (count>1){
                String s=String.valueOf(count);

                for (int i=0;i<s.length();i++){
                    arr[left++]=s.charAt(i);
                }
            }
        }

        return left;
    }
}