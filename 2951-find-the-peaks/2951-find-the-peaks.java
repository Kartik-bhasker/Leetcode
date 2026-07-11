class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]!=mountain[i-1] && mountain[i]!=mountain[i+1]){
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    list.add(i);
                }
            }
        }return list;
    }
}