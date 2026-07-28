class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> posList=new ArrayList<>();
        ArrayList<Integer> negList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posList.add(nums[i]);
            }
            else{
                negList.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=posList.get(i);
            nums[2*i+1]=negList.get(i);
        }return nums;
    }
}