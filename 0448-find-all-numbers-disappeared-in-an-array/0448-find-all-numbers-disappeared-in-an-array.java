class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }return list;
    }
    void Cyclicsort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    void swap(int[] nums,int i,int correctIndex){
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }
}