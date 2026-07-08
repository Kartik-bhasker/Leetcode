class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int original=x;
        if(x<0){
            return false;//negative cannot be palindrome
        }
        while(x>0){
            int lastDigit=x%10;
            rev=(rev*10)+lastDigit;
            x=x/10;
        }
        if(original==rev){
            return true;
        }
        else{
            return false;
        }
    }
}