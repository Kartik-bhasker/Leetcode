class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isDayPossible(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return ans;
    }
    boolean isDayPossible(int[] bloomDay,int m,int k,int mid){//mid means blooming day
        int count=0;
        int possibleBoq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;//blooming possible
            }
            else{
                possibleBoq=possibleBoq+count/k;//before making count 0,first store no boq from previous oen 
                count=0;//now count0,to make another boq
            }
            
        }
        possibleBoq=possibleBoq+count/k;
        if(possibleBoq>=m){
            return true;
        }
        return false;
    }
}