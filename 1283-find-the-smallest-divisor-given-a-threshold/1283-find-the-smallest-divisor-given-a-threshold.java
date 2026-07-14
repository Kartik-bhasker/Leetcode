class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumByD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
    int sumByD(int[] nums,int div){
        int sum=0;
        for(int num: nums){
            sum+=Math.ceil((double)num/div);
        }return sum;
    }
}