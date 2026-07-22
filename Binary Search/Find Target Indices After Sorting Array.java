/*
 * LeetCode: 2089. Find Target Indices After Sorting Array
 * Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 *
 * Pattern: Binary Search
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding the output list)
 *
 * Idea:
 * - Count the number of elements less than the target.
 * - Count the occurrences of the target.
 * - The target occupies consecutive indices starting from the count of smaller elements.
 */

import java.util.*;

class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {

        int count = 0;
        int lessThan = 0;

        List<Integer> indices = new ArrayList<>();

        for (int num : nums) {
            if (num == target) {
                count++;
            }
            if (num < target) {
                lessThan++;
            }
        }

        for (int i = 0; i < count; i++) {
            indices.add(lessThan++);
        }

        return indices;
    }
}