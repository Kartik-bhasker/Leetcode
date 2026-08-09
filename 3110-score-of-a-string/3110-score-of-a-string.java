class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            int ch1=s.charAt(i)-'a';
            int ch2=s.charAt(i-1)-'a';
            if(ch2>=ch1){
                ans+=ch2-ch1;
            }
            else{
                ans+=ch1-ch2;
            }
        }
        return ans;
    }
}