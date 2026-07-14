class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] rev=new int[nums.length];
        int[] ans=new int[2*nums.length];
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            int temp=nums[start];
            rev[start]=nums[end];
            rev[end]=temp;
            start++;
            end--;
        }
        for(int j=0;j<2*nums.length;j++){
            if(j<nums.length){
                ans[j]=nums[j];
            }
            else{
                ans[j]=rev[j-nums.length];
            }
        }
        return ans;
    }
}