class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // if(nums.length==1 && nums[0]=1){
        //     return 1;
        // }
        // else if(nums.length==1 && nums[0]!=1){
        //     return 0;
        // }
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }return max;
    }
}