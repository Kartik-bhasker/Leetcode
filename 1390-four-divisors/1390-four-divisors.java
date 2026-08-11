class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            int currSum=0;
            int n=nums[i];
            for(int j=1;j<=Math.sqrt(n);j++){
                if(n%j==0){
                    cnt++;
                    currSum+=j;
                    if((n/j)!=j){
                        cnt++;
                        currSum+=n/j;
                    }
                }
            }
            if(cnt==4){
                sum+=currSum;
            }
        }return sum;
    }
}