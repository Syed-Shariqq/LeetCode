/*
 * LeetCode: 349. Intersection of Two Arrays
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(min(n, m))
 *
 * Idea:
 * - Sort both arrays.
 * - Traverse them using two pointers.
 * - Store only unique common elements in the result array.
 */

import java.util.Arrays;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] intersection = new int[Math.min(nums1.length, nums2.length)];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

                if (idx == 0 || intersection[idx - 1] != nums2[j]) {
                    intersection[idx++] = nums1[i++];
                }

                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(intersection, idx);
    }
}