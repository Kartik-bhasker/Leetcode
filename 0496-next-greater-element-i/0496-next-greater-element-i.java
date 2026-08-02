class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int index=-1;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    for(int x=index;x<nums2.length;x++){
                        if(nums2[x]>nums1[i]){
                            ans[i]=nums2[x];
                            break;
                        }
                        else{
                            ans[i]=-1;
                        }
                    }
                }
            }
        }return ans;
    }
}