class Solution {
    public int[][] merge(int[][] intervals) {
        //to sort 2D arr 
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            //if list empty or no overlap so add new interval to list 
            if(ans.size()==0 || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else{
                int last=ans.size()-1;
                int end=Math.max(ans.get(last).get(1), intervals[i][1]);
                ans.get(last).set(1, end);
            }
        }
        int[][] result = new int[ans.size()][2];
        for (int i=0;i<ans.size();i++) {
            result[i][0]=ans.get(i).get(0);
            result[i][1]=ans.get(i).get(1);
        }return result;
    }
}