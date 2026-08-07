class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String[] arr=str.split(" ");
        String word=arr[arr.length-1];
        return word.length();
    }
}