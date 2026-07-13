class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int sum=0;
        for(int row=0;row<accounts.length;row++){
            sum=0;
            int[] ans=accounts[row];
            for(int i=0;i<ans.length;i++){
                sum=sum+ans[i];
                if(sum>max){
                    max=sum;
                }
            }
        }return max;
    }
}