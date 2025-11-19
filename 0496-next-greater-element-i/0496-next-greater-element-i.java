class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];

        int k=0;
        for (int i=0;i<nums1.length;i++){
            int x=nums1[i];
            int index=-1;
            for (int j=0;j<nums2.length;j++){
                if (nums2[j]==x){
                    index=j;
                    break;
                }
            }

            int count=0;
            for (int j=index+1;j<nums2.length;j++){
                if (nums2[j]>x){
                    arr[k++]=nums2[j];
                    count=1;
                    break;
                }
            }
            if (count==0){
                arr[k++]=-1;
            }
        }

        return arr;
    }
}