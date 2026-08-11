class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String[] check=sentences[i].split(" ");
            maxi=Math.max(maxi,check.length);
        }return maxi;
    }
}