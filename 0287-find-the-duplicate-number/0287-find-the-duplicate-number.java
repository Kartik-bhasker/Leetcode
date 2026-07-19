class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]==nums[1]){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }return -1;
    }
}