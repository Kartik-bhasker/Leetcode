class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }return ans;
    }
    void sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }       
        }
    }
    void swap(int[] nums,int i,int correctIndex){
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }
}