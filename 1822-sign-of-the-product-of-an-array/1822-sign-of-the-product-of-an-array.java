class Solution {
    public int arraySign(int[] nums) {
        int x=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                x=0;
                return signFunc(x);
            }
            if(nums[i]<0){
                count++;
            }
        }
        if(count%2==1){
            x=-1;
        }
        else{
            x=1;
        }
        int ans=signFunc(x);
        return ans;
    }
    int signFunc(int x){
        if(x==0)return 0;
        if(x==1)return 1;
        return -1;
    }
}