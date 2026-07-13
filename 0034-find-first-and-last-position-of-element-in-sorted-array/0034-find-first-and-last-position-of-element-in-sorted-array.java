class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);
        if(lb==nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        else{
            return new int []{lb,ub-1};
        }
    }
    int lowerBound(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return ans;
    }
    int upperBound(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return ans;
    }
    
}