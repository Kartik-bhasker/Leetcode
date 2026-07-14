class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find maximum element
        int maxPile = Arrays.stream(piles).max().getAsInt();

        // Initialize low and high pointers
        int low = 1, high = maxPile;
        int ans = maxPile;

        // Binary search on answer space
        while (low <= high) {
            int mid = low+(high-low) / 2;
            long totalH = calculateTotalHours(piles, mid);

            // If possible, try smaller speed
            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }
            // Otherwise, try larger speed
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    long calculateTotalHours(int[] piles, int speed) {
        long totalH = 0;
        for (int bananas : piles) {
            totalH += (long)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }
}