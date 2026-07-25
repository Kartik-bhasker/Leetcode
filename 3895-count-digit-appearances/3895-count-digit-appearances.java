class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int n=nums[i];
            if (n == 0 && digit == 0) {
                count++;
            }
            while(n>0){
                int lastDigit=n%10;
                if(lastDigit==digit){
                    count++;
                }
                n=n/10;
            }ans+=count;
        }return ans;
    }
}