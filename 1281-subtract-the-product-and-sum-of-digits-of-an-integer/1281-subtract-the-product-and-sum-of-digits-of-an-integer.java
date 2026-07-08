class Solution {
    public int subtractProductAndSum(int n){
        int Product=1;
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            Product=Product*lastDigit;
            sum=sum+lastDigit;
            n=n/10;


        }
        return Product-sum;

    }
}