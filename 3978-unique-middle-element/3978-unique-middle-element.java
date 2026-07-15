class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        if(nums.length==1){
            return true;
        }
        int mid=(0+nums.length-1)/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[mid]){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}