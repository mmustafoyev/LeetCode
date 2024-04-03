class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // If nums[mid] > nums[mid + 1], the peak might be on the left side
                end = mid;
            } else {
                // Otherwise, the peak might be on the right side
                start = mid + 1;
            }
        }
        // At the end of the loop, start and end will converge to the peak element
        return start;
    }
}