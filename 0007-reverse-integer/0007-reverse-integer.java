class Solution {
    public int reverse(int x) {
        int rev = 0;
        //negatives
        if(x<0){
            int x1 = x;
            while (x1 < 0) {
                int lD=x1%10;
                //overflow condition
                if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&lD<-8)) {
                    return 0;
                }
                rev=rev*10+lD;
                x1=x1/10;
            }
            return rev;
        }
        //positives
        while(x>0) {
            int lD=x%10;
            //overflow condition
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&lD>7)) {
                return 0;
            }
            rev=rev*10+lD;
            x=x/10;
        }
        return rev;
    }
}