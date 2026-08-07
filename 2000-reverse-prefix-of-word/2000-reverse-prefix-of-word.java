class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))){
            return word;
        }
        int index=word.indexOf(ch);
        StringBuilder sb=new StringBuilder(word);
        int j=index;int i=0;
        while(i<j){
            //swap
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
        return sb.toString();
    }
}