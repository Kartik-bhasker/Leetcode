class Solution {
    public List<Integer> findDuplicates(int[] nums){
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
        ArrayList<Integer> list=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(nums[i]);
            }
        }return list;
    }
    void swap(int[] nums,int i,int correctIndex){
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }
}