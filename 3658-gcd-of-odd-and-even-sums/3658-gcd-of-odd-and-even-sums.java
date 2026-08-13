class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;int sumEven=0;
        for(int i=1;i<2*n;i=i+2){
            sumOdd+=i;
        }
        for(int i=2;i<2*n;i=i+2){
            sumEven+=i;
        }
        return gcd(sumOdd,sumEven);
    }
    int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        else return a;
    } 
}