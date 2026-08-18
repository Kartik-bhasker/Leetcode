class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            if(i==0) nums[0]=start;
            else nums[i]=start+2*i;
        }
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }return xor;
    }
}