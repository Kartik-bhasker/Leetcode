class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq-1);
                //if ch appear more then in s 
                if(map.get(ch)<0){
                    return false;
                }
            }
            //if ch doesnt exist 
            else{
                return false;
            }
            //if ch in t count less then in s case is covered in start 
        }
        return true;
    }
}