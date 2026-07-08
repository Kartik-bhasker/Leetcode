class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + k;

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

        return list;
    }
}