class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        int i=0;
        while(i<s.length()-1){
            int c1=map.get(s.charAt(i));
            int c2=map.get(s.charAt(i+1));
            if(c1>=c2){
                ans+=map.get(s.charAt(i));
                i++;
            }
            else{
                ans+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i=i+2;
            }
            
        }
        //if last ch left
        if(i<s.length()){
            ans+=map.get(s.charAt(i));
        }
        return ans;
    }
}