class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n1=stones.length();
        int n2=jewels.length();
        int cnt=0;
        StringBuilder sb=new StringBuilder(stones);
        for(int i=0;i<sb.length();i++){
            for(int j=0;j<n2;j++){
                if(sb.charAt(i)==jewels.charAt(j)){
                    cnt++;
                    break;
                }
            }
        }return cnt;
    }
}