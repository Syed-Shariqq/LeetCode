/*
 * LeetCode: 128. Longest Consecutive Sequence
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * Pattern: HashSet
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Idea:
 * - Store all elements in a HashSet for O(1) lookups.
 * - Start counting only from numbers that do not have a predecessor.
 * - Expand the consecutive sequence and keep track of the maximum length.
 */

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int length = 0;

                while (set.contains(num + length)) {
                    length += 1;
                }

                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}