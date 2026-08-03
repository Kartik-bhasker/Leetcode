class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    rows.add(1);
                }
                //sum of the two elements above from previous row
                else{
                    List<Integer> prevRow = list.get(i - 1);
                    rows.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            list.add(rows);
        }return list;
    }
}