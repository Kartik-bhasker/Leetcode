class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] ans=new int[nums.length];
        if(nums.length==1){
            return new int[]{nums[0]};
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==1){
                list.add(nums[j]);
            }
        }
        for(int j=0;j<list.size();j++){
            ans[j]=list.get(j);
        }
        return ans;

    }
}