class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        for(int num: set){
            ans=num;
        }
        return ans;
    }
}