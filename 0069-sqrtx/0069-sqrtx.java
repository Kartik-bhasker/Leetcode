class Solution {
    public int mySqrt(int x) {
        //return (int)Math.sqrt(x); it is one line code for this 

        //linear search 
        /*int ans=1;
        for(int i=1;i<=x;i++){
            if(i*i<=x){
                ans=i;
            }
            else{
                break;
            }
        }return ans;*/

        //binary search
        int low=1;
        int high=x;
        int ans=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(((long)mid*mid)<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return high;//or ans 
    }
}