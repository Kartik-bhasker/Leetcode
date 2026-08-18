class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                xor=xor^num;
            }
        }return xor;
    }
}