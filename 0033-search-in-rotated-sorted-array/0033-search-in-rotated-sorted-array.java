class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        //if you do not find a pivot,means arr isn't sorted
        if(pivot==-1){
            //just do normal BS
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found you have found 2 asc sorted arr
        //there are again 3 cases
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //all 4 cases 
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;//pivot element
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;//pivot element
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return -1;
    }
    int binarySearch(int[] nums, int target,int start,int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return -1;
    }
}