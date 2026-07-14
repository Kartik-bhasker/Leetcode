class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int check=n/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>check){
                return nums[i];
            }


        }return -1;
        
    }
}