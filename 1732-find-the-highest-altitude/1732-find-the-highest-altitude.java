class Solution {
    public int largestAltitude(int[] gain) {
        int[] check=new int[gain.length+1];
        int highestAltitude=0;
        check[0]=0;
        for(int i=1;i<check.length;i++){
            check[i]=gain[i-1]+check[i-1];          
            if(check[i]>highestAltitude){
                highestAltitude=check[i];
            }
        }
        return highestAltitude;
    }
}