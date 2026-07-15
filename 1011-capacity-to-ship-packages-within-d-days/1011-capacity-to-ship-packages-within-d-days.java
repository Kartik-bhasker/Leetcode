class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        while(low<=high){
            int mid=low+(high-low)/2;
            int noOfDays=daysReq(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
    int daysReq(int[] weights,int mid){
        int days=1;
        int currentLoad=0;
        for(int w:weights){
            if(currentLoad+w>mid){
                days=days+1;
                currentLoad=w;
            }
            else{
                currentLoad=currentLoad+w;
            }
        }
        return days;
    }
}