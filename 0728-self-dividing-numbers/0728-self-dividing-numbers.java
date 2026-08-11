class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9){
                list.add(i);
            }
            else{
                boolean isTrue=true;
                int n=i;
                while(n>0){
                    int ld=n%10;
                    if(ld==0 || i%ld!=0){
                        isTrue=false;
                        break;
                    }
                    n=n/10;
                }
                if(isTrue==true)list.add(i);
            }
        }return list;
    }
}