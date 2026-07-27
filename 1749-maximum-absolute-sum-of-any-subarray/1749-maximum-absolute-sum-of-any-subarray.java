class Solution {
    public int maxAbsoluteSum(int[] nums) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long Maxsum=0;
        long Minsum=0;
        for(int i=0;i<nums.length;i++){
            Maxsum+=nums[i];
            if(Maxsum>max){
                max=Maxsum;
            }
            if(Maxsum<0){
                Maxsum=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            Minsum+=nums[i];
            if(Minsum<min){
                min=Minsum;
            }
            if(Minsum>0){
                Minsum=0;
            }
        }
        if(min*(-1)>max){
            return (int)min*(-1);
        }
        return (int)max;
    }
}