class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int cnt=0;int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            cnt++;
        }
        if(cnt==0)return 0;
        return sum/cnt;
    }
}