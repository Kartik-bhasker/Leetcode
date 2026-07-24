class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        //adding all non 0 to list 
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        int k=list.size();
        for(int i=0;i<k;i++){
            nums[i]=list.get(i);
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
    }
}