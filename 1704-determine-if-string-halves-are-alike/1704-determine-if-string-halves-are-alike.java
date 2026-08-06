class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        int cnt=0;int cnt2=0;
        for(int i=0;i<str.length()/2;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cnt+=1;
            }
        }
        for(int j=str.length()/2;j<str.length();j++){
            char ch=str.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cnt2+=1;
            }
        }
        return (cnt==cnt2);
    }
}