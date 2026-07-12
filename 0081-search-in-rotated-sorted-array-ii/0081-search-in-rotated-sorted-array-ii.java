class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivotwithduplicates(nums);

        // if you do not find a pivot, means array isn't rotated
        if (pivot == -1) {
            // just do normal BS
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found
        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    int findPivotwithduplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // all 4 cases
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // if elements at start, mid, end are equal just skip duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                // check for start
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check for end
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right
            else if (nums[start] < nums[mid] ||
                    (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return true;
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}