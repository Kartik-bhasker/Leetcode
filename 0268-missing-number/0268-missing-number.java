class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        //handling edge case for last element 
        if(n!=nums[n-1]){
            return n;
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }return -1;
    }
}