/*
 * LeetCode: 2089. Find Target Indices After Sorting Array
 * Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 *
 * Pattern: Binary Search
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n)
 *
 * Idea:
 * - Sort the array.
 * - Traverse the sorted array.
 * - Store all indices where the target value appears.
 */

import java.util.*;

class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> indices = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }

        return indices;
    }
}