class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                list.add(nums[i]);
            }
        }
        int  sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        return sum;
    }
}