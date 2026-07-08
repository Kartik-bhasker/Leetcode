class Solution {
    public int countDigits(int num) {
        int count=0;
        int original=num;
        while(num>0){
            int val=num%10;
            if(original%val==0){
                count=count+1;
            }
            else{
                count=count+0;
            }
            num=num/10;
        }
        return count;
        
    }
}