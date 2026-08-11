class Solution {
    public int commonFactors(int a, int b) {
        int cnt=0;
        int max=0;
        if(a>b)max=a;
        else max=b;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                cnt++;
            }
        }return cnt;
    }
}