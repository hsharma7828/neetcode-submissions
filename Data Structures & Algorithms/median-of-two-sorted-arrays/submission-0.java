class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        int half = (m + n + 1) / 2;

        while (low <= high) {

            // Partition nums1
            int part1 = (low + high) / 2;

            // Remaining elements required from nums2
            int part2 = half - part1;

            // Boundary values
            int nums1Left = (part1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[part1 - 1];

            int nums1Right = (part1 == m)
                    ? Integer.MAX_VALUE
                    : nums1[part1];

            int nums2Left = (part2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[part2 - 1];

            int nums2Right = (part2 == n)
                    ? Integer.MAX_VALUE
                    : nums2[part2];

            // Correct partition
            if (nums1Left <= nums2Right &&
                nums2Left <= nums1Right) {

                // Odd number of elements
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                }

                // Even number of elements
                int leftMax = Math.max(nums1Left, nums2Left);
                int rightMin = Math.min(nums1Right, nums2Right);

                return (leftMax + rightMin) / 2.0;
            }

            // nums1 partition is too far right
            if (nums1Left > nums2Right) {
                high = part1 - 1;
            }

            // nums1 partition is too far left
            else {
                low = part1 + 1;
            }
        }

        return 0.0;
    }
}