class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            int lastDigit=n%10;
            list.add(lastDigit);
            n=n/10;
        }
        Collections.sort(list);
        int x=list.size();
        
        return list.get(x-1)*list.get(x-2);
        
    }
}