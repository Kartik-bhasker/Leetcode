class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end=end+nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            //calculate how many pieces we can divide this with max sum
            int sum=0;
            int pieces=1;//atleast we can divide into 1 piece
            for(int num: nums){
                if(sum+num>mid){
                    //you cannot add this in this subarray make new one 
                    sum=num;
                    pieces++;
                }
                else{
                    sum=sum+num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }return start;//or end as at last start=mid=end
    }
}