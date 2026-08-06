class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first=null;
        String second=null;
        for(int i=0;i<word1.length;i++){
            first+=word1[i];
        }
        for(int j=0;j<word2.length;j++){
            second+=word2[j];
        }
        return (first.equals(second));
    }
}