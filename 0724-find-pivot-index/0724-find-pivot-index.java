class Solution {

    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int leftSize = 0;
        int rightSize = n;

        // Initially, right contains all elements
        for (int i = 0; i < n; i++) {
            right[i] = nums[i];
        }

        int leftSum = 0;
        int rightSum = 0;

        // Initial right sum
        for (int i = 0; i < n; i++) {
            rightSum += right[i];
        }

        for (int i = 0; i < n; i++) {

            // Remove current element from the right side
            rightSum -= nums[i];

            // Check if current index is the pivot
            if (leftSum == rightSum) {
                return i;
            }

            // Move current element to the left side
            left[leftSize++] = nums[i];
            leftSum += nums[i];
        }

        return -1;
    }
}