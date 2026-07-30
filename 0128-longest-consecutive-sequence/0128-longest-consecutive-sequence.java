class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int largest=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;int x=it;
                while(set.contains(x+1)){
                    x++;cnt++;
                }
                largest=Math.max(largest,cnt);
            }
        }return largest;
    }
}