class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int el=0;
        //step1-Apply Moore Voting algo
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        //verify if el is majority or not 
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                count1++;
            }
        }
        if(count1>(n/2)){
            return el;
        }
        return -1;
    }
}