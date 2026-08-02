class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int preSum=0;
        map.put(0,1);//base case 
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            //if prefix sum already added
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            //if not added already so add 
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }return count;
    }
}