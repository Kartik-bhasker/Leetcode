class Solution {
    public boolean isPalindrome(String s) {
       String s2=s.replaceAll("[^a-zA-Z0-9]", "");
       String s1=s2.toLowerCase();
       for(int i=0;i<s1.length()/2;i++){
        char start=s1.charAt(i);
        char end=s1.charAt(s1.length()-1-i);
        if(start!=end){
            return false;
        }
       }return true;
    }
}