class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int k=1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + k;
            list.add(sum % 10);
            k = sum / 10;
        }
        while (k > 0) {
            list.add(k % 10);
            k = k / 10;
        }
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}