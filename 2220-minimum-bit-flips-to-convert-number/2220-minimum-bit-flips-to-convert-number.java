class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=0; 
        //XOR give 1 where bits are different
        int xor=start^goal;
        while(xor!=0){
            //If last bit is 1 increment count 
            ans+=xor&1;
            //right shift to check the next bit
            xor>>=1;
        }
        return ans;
    }
}