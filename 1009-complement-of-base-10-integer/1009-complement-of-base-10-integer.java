class Solution {
    public int bitwiseComplement(int n) {
        String binary=Integer.toBinaryString(n);
        String check=null;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                check+='0';
            }
            else check+='1';
        }
        //binary to decimal
        int len=check.length();int num=0;int p2=1;
        for(int j=len-1;j>=0;j--){
            if(check.charAt(j)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }
}