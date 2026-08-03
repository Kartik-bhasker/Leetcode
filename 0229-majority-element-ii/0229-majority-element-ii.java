class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                count2 = 1;
            }
            else if (nums[i] == el1) {
                count1++;
            }
            else if (nums[i] == el2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        // Verify
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) count1++;
            if (nums[i] == el2) count2++;
        }
        int mini = nums.length / 3 + 1;
        if (count1 >= mini) result.add(el1);
        if (count2 >= mini && el1 != el2) result.add(el2);
        return result;
    }
}