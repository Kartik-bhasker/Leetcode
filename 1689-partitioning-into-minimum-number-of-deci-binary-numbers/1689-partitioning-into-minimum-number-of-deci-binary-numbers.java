class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        int check=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            check=ch-'0';
            if(check>max){
                max=check;
            }
        }return max;
    }
}