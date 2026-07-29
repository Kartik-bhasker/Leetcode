class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> all=new ArrayList<>();
        Arrays.sort(nums);
        allPermute(nums,0,all);
        return all;
    }
    void allPermute(int[] nums, int start, List<List<Integer>> all) {
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            all.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            allPermute(nums, start + 1, all);
            swap(nums, i, start);
        }
    }
    void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}