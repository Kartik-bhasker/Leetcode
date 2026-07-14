class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            //right shift
            for(int end=i;end>index[i];end--){
                target[end]=target[end-1];
            }
            //insert
            target[index[i]]=nums[i];
        }
        return target;
    }
}