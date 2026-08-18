class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            if(i==k-1){
                ans=ans+(arr[i]);
            }
            else ans=ans+(arr[i])+" ";
        }return ans;
    }
}