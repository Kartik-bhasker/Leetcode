class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(position,mid,m)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return high;
    }
    boolean canWePlace(int[] position,int mid,int m){
        int countBowls=1;
        int lastBowl=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastBowl>=mid){
                countBowls++;
                lastBowl=position[i];
            }
        }
        if(countBowls>=m){
            return true;       
        } 
        return false;
    }
}