class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String check=null;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                check+='0';
            }
            else check+='1';
        }
        //binary to decimal
        int len=check.length();int n=0;int p2=1;
        for(int j=len-1;j>=0;j--){
            if(check.charAt(j)=='1'){
                n=n+p2;
            }
            p2=p2*2;
        }
        return n;
    }
}