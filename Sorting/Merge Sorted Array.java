/*
 * LeetCode: 88. Merge Sorted Array
 * Link: https://leetcode.com/problems/merge-sorted-array/
 *
 * Pattern: Two Sorted Arrays
 * Difficulty: Easy
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Start comparing elements from the end of both arrays.
 * - Place the larger element at the end of nums1.
 * - Continue until all elements from nums2 are merged.
 */

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}